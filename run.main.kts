@file:Repository("https://jitpack.io")
@file:Repository("https://maven.google.com")
@file:Repository("https://repo.maven.apache.org/maven2")

@file:DependsOn("com.github.DevSrSouza:svg-to-compose:-SNAPSHOT")
@file:DependsOn("com.google.guava:guava:23.1-jre")
@file:DependsOn("com.android.tools:sdk-common:27.2.0-alpha16")
@file:DependsOn("com.android.tools:common:27.2.0-alpha16")
@file:DependsOn("com.squareup:kotlinpoet:1.7.2")
@file:DependsOn("org.ogce:xpp3:1.1.6")

import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import java.io.File

// 1. download phosphor-icons-zip
// 2. unzip it
// 3. convert svg to compose path
// 4. reset all path's default size