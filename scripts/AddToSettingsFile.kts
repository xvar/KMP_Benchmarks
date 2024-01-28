#!/usr/bin/env kotlin

import java.io.File

val modulePrefix = ":compose-modules:only-compose-module"

val maxLine = 500
val settingsFile = File("settings.gradle.kts")
val includeLines = (1..500).map { number ->
    "include(\"$modulePrefix-$number\")"
}

settingsFile
    .appendText("${includeLines.joinToString("\n")}\n")