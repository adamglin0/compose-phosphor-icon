import java.io.File
import java.io.FileOutputStream
import java.net.HttpURLConnection
import java.net.URL
import java.util.zip.ZipFile

val workDir = File("./temp")

download()
unzip("./temp/phosphor-icons.zip", "./temp/phosphor-icons")
rename("./temp/phosphor-icons/SVGs Flat/bold", "bold")
rename("./temp/phosphor-icons/SVGs Flat/duotone", "duotone")
rename("./temp/phosphor-icons/SVGs Flat/fill", "fill")
rename("./temp/phosphor-icons/SVGs Flat/light", "light")
rename("./temp/phosphor-icons/SVGs Flat/regular", "")
rename("./temp/phosphor-icons/SVGs Flat/thin", "thin")

fun download() {
    val phosphorIconDownloadUrl = "https://phosphoricons.com/assets/phosphor-icons.zip"


    if (!workDir.exists()) {
        println("create /temp folder")
        workDir.mkdirs()
    }
    val saveFile = File(workDir, "phosphor-icons.zip")

    val url = URL(phosphorIconDownloadUrl)
    val connection = url.openConnection() as HttpURLConnection

    val fileSize = connection.contentLengthLong

    connection.inputStream.use { input ->
        FileOutputStream(saveFile).use { output ->
            val buffer = ByteArray(4096)
            var bytesRead: Int
            var totalBytesRead: Long = 0

            while (input.read(buffer).also { bytesRead = it } != -1) {
                output.write(buffer, 0, bytesRead)
                totalBytesRead += bytesRead

                val progress = (totalBytesRead * 100f / fileSize).toInt()
                print("\rDownload Progress: $progress%")
            }
        }
    }

    println("\rfiles download success: ${saveFile.absolutePath}")
}

fun unzip(zipFilePath: String, destDir: String) {
    println("unziping to $destDir")
    val destDirectory = File(destDir)
    if (!destDirectory.exists()) {
        destDirectory.mkdir()
    }

    ZipFile(zipFilePath).use { zip ->
        zip.entries().asSequence().forEach { entry ->
            val filePath = File(destDirectory, entry.name)
            if (entry.isDirectory) {
                filePath.mkdirs()
            } else {
                filePath.parentFile.mkdirs()
                zip.getInputStream(entry).use { input ->
                    filePath.outputStream().use { output ->
                        input.copyTo(output)
                    }
                }
            }
        }
    }
    print("\runzip success")
}

fun rename(dirString: String, type: String) {
    val directory = File(dirString)
    if (directory.exists() && directory.isDirectory) {
        directory.listFiles()?.forEach { file ->
            if (file.isFile && file.extension == "svg") {
                val newName = file.nameWithoutExtension
                    .removeSuffix("-$type")
                    .let(::snakeToCamel) + ".svg"

                val newFile = File(directory, newName)
                file.renameTo(newFile)
            }
        }
        println("✅$type files have been successfully renamed.")
    } else {
        println("Directory does not exist or is not a directory.")
    }
}

fun snakeToCamel(snake: String): String {
    return snake.split("-")
        .joinToString("") { it.capitalize() }
}