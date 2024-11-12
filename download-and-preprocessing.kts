import java.io.File
import java.io.FileOutputStream
import java.net.HttpURLConnection
import java.net.URL
import java.util.zip.ZipFile

val workDir = File("./temp")
val phosphorIconDownloadFile = File(workDir, "phosphor-icons.zip")
val phosphorIconDownloadUrl = "https://phosphoricons.com/assets/phosphor-icons.zip"

downloadFile(
    phosphorIconDownloadFile,
    phosphorIconDownloadUrl
)

unzip("./temp/phosphor-icons.zip", "./temp/phosphor-icons")
rename("./temp/phosphor-icons/SVGs Flat/bold", "bold")
rename("./temp/phosphor-icons/SVGs Flat/duotone", "duotone")
rename("./temp/phosphor-icons/SVGs Flat/fill", "fill")
rename("./temp/phosphor-icons/SVGs Flat/light", "light")
rename("./temp/phosphor-icons/SVGs Flat/regular", "")
rename("./temp/phosphor-icons/SVGs Flat/thin", "thin")

for (file in File("./temp/phosphor-icons/SVGs Flat").walk()) {
    if (file.isFile) {
        setSvgSizeTo24(file)
    }
}

fun downloadFile(targetFile: File, downloadUrl: String) {
    val parentDir = targetFile.parentFile
    if (parentDir.exists()) {
        deleteDirectory(parentDir)
    }
    println("creating ${parentDir}")
    parentDir.mkdirs()
    val url = URL(downloadUrl)
    val connection = url.openConnection() as HttpURLConnection

    val fileSize = connection.contentLengthLong

    connection.inputStream.use { input ->
        FileOutputStream(targetFile).use { output ->
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

    println("\rfiles download success, save in ${targetFile.absolutePath}")
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
    println("\runzip success")
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
        println("✅[$type] files have been successfully renamed.")
    } else {
        println("Directory does not exist or is not a directory.")
    }
}

fun snakeToCamel(snake: String): String {
    return snake.split("-")
        .joinToString("") { it.capitalize() }
}

fun deleteDirectory(directory: File): Boolean {
    if (directory.exists()) {
        directory.listFiles()?.forEach { file ->
            if (file.isDirectory) {
                deleteDirectory(file)
            } else {
                file.delete()
            }
        }
    }
    return directory.delete()
}

fun setSvgSizeTo24(file: File) {
    val svgContent = file.readText()
    // viewBox="0 0 256 256"
    val updatedSvgContent = svgContent.replace(
        """(viewBox="\d+ \d+ \d+ \d+")""".toRegex(),
        "viewBox=\"0 0 24 24\""
    )
    file.writeText(updatedSvgContent)
    println("✅ $file size has been set to 24x24")
}