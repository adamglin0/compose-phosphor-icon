@file:Repository("https://jitpack.io")
@file:Repository("https://maven.google.com")
@file:Repository("https://repo.maven.apache.org/maven2")
@file:Repository("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")

@file:DependsOn("com.github.DevSrSouza:svg-to-compose:-SNAPSHOT")
@file:DependsOn("com.google.guava:guava:23.1-jre")
@file:DependsOn("com.android.tools:sdk-common:27.2.0-alpha16")
@file:DependsOn("com.android.tools:common:27.2.0-alpha16")
@file:DependsOn("com.squareup:kotlinpoet:1.7.2")
@file:DependsOn("org.ogce:xpp3:1.1.6")
@file:DependsOn("io.ktor:ktor-client-core-jvm:3.0.1")
@file:DependsOn("io.ktor:ktor-client-okhttp-jvm:3.0.1")

import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.util.cio.*
import io.ktor.utils.io.*
import kotlinx.coroutines.runBlocking
import java.io.File
import java.util.zip.ZipFile
import kotlin.time.Duration.Companion.minutes


downloadFile(
    "./temp/icons.zip",
    "https://github.com/phosphor-icons/homepage/releases/download/v2.1.0/phosphor-icons.zip"
)
unzip("./temp/icons.zip", "./temp/icons")
File("./temp/icons").walkTopDown()
    .filter { file -> file.isFile && file.extension == "svg" }
    .forEach { file ->
        val content = file.readText()
        val updatedContent = content.replace(
            Regex("<svg([^>]*?)>"),
            "<svg\$1 width=\"24\" height=\"24\">"
        )
        file.writeText(updatedContent)
    }
Svg2Compose.parse(
    applicationIconPackage = "com.adamglin",
    accessorName = "PhosphorIcons",
    outputSourceDirectory = File("phosphor/src/commonMain/kotlin"),
    vectorsDirectory = File("./temp/icons/SVGs Flat/"),
    type = VectorType.SVG,
    allAssetsPropertyName = "AllIcons",
    generatePreview = false,
    iconNameTransformer = { s1, s2 ->
        return@parse convertSnakeToCamel(s1, removeLastSplit = s2 != "Regular")
    }
)

fun downloadFile(outputFile: String, url: String) {
    val file = File(outputFile)
    file.mkdirIfNotExist()
    runBlocking {
        HttpClient(OkHttp) {
            install(HttpTimeout) {
                requestTimeoutMillis = 30.minutes.inWholeMilliseconds
            }
        }.get(url) {
            onDownload { bytesSentTotal, contentLength ->
                if (contentLength != null) {
                    print("\rDownloading ${bytesSentTotal * 100 / contentLength}% from $url")
                }
            }
        }.bodyAsChannel().copyAndClose(file.writeChannel())
    }
    println("\rDownload success from $url")
}

fun unzip(zipFile: String, outputDir: String) = ZipFile(zipFile).use { zip ->
    var count = 0
    zip.entries().asSequence().forEach { entry ->
        val filePath = File(outputDir, entry.name)
        if (entry.isDirectory) {
            filePath.mkdirs()
        } else {
            count++
            print("\runzip $count files")
            filePath.parentFile.mkdirs()
            zip.getInputStream(entry).use { input ->
                filePath.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
        }
    }
}

fun File.mkdirIfNotExist(isDir: Boolean = false) {
    if (!exists()) {
        if (isDir) mkdir() else parentFile.mkdir()
    }
}

fun convertSnakeToCamel(snake: String, removeLastSplit: Boolean): String {
    val parts = snake.split("-").dropLast(if (removeLastSplit) 1 else 0)
    return parts.joinToString("") {
        it.replaceFirstChar { char -> char.uppercase() }
    }
}