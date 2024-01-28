#!/usr/bin/env kotlin

import java.io.File

val maxLine = 10
val depsFile = File("androidApp/build.gradle.kts")
val existingContent = depsFile.readText()

val modifiedContent = existingContent.replace("implementation(projects.composeModules.onlyComposeModule0)", generateGreetingViewLines())

depsFile.writeText(modifiedContent)

fun generateGreetingViewLines(): String {
    val greetingViewLines = (1..maxLine).joinToString("\n") { number ->
        "    implementation(projects.composeModules.onlyComposeModule$number)"
    }
    return "implementation(projects.composeModules.onlyComposeModule0)\n$greetingViewLines\n"
}