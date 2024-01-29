#!/usr/bin/env kotlin

import java.io.File
import java.nio.file.FileVisitOption
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption

val maxLine = 500

fun copyAndRenameModule(sourcePath: Path, destinationPath: Path, moduleNumber: Int) {
    // Copy the entire directory to the new location
    Files.walk(sourcePath, FileVisitOption.FOLLOW_LINKS).forEach { source ->
        val destination = destinationPath.resolve(sourcePath.relativize(source))
        val path = source.toString()
        val contains = when {
            path.endsWith("src") || path.contains("Greeting") || path.contains("build.gradle.kts") ||
            path.endsWith("commonMain") -> true
            path.contains("commonMain") &&
                (path.endsWith("kotlin") || path.endsWith("com") || path.endsWith("example")
                        || path.endsWith("kmp_sample_gen")) -> true
            else -> false
        }
        println("$path $contains")
        if (contains) {
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING)
        }
    }

    // Update the function name in ComposableShared.kt
    val composableFile = destinationPath.resolve("src/commonMain/kotlin/com/example/kmp_sample_gen/Greeting.kt")
    composableFile.toFile().writeText(composableFile.toFile().readText().replace("Greeting", "Greeting$moduleNumber"))

    val newComposableFile = destinationPath.resolve("src/commonMain/kotlin/com/example/kmp_sample_gen/Greeting$moduleNumber.kt")
    composableFile.toFile().renameTo(newComposableFile.toFile())
}


val baseDirectory = Path.of("shared")
val basePackage = "com.example.kmp_sample_gen"  // Adjust this based on your project's package structure

for (i in 1..maxLine) {
    val newModuleNumber = i
    val newModuleName = "shared-$newModuleNumber"
    val newModulePath = Path.of("$newModuleName")

    // Create the new module directory
    Files.createDirectories(newModulePath)

    // Copy and rename the module
    copyAndRenameModule(baseDirectory, newModulePath, newModuleNumber)
}
