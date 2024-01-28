#!/usr/bin/env kotlin

import java.io.File
import java.nio.file.FileVisitOption
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption

val maxLine = 10

fun copyAndRenameModule(sourcePath: Path, destinationPath: Path, moduleNumber: Int) {
    // Copy the entire directory to the new location
    Files.walk(sourcePath, FileVisitOption.FOLLOW_LINKS).forEach { source ->
        val destination = destinationPath.resolve(sourcePath.relativize(source))
        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING)
    }

    // Update the function name in ComposableShared.kt
    val composableFile = destinationPath.resolve("src/main/kotlin/com/example/kmp_sample_gen/ComposableShared.kt")
    composableFile.toFile().writeText(composableFile.toFile().readText().replace("GreetingView0", "GreetingView$moduleNumber"))

    val newComposableFile = destinationPath.resolve("src/main/kotlin/com/example/kmp_sample_gen/ComposableShared$moduleNumber.kt")
    composableFile.toFile().renameTo(newComposableFile.toFile())
}


val baseDirectory = Path.of("compose-modules/only-compose-module-0")
val basePackage = "com.example.kmp_sample_gen"  // Adjust this based on your project's package structure

for (i in 1..maxLine) {
    val newModuleNumber = i
    val newModuleName = "only-compose-module-$newModuleNumber"
    val newModulePath = Path.of("compose-modules/$newModuleName")

    // Create the new module directory
    Files.createDirectories(newModulePath)

    // Copy and rename the module
    copyAndRenameModule(baseDirectory, newModulePath, newModuleNumber)
}
