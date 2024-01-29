#!/usr/bin/env kotlin

import java.io.File

val modulePrefix = ":shared"

val maxLine = 10
val settingsFile = File("settings.gradle.kts")
val includeLines = (1..maxLine).map { number ->
    "include(\"$modulePrefix-$number\")"
}

settingsFile
    .appendText("${includeLines.joinToString("\n")}\n")