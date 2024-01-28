#!/usr/bin/env kotlin

import java.io.File

val maxLine = 10
val composableFile = File("androidApp/src/main/java/com/example/kmp_sample_gen/android/MainActivity.kt")
val existingContent = composableFile.readText()

// Find and modify the line containing "GreetingView0(text)"
val modifiedContent = existingContent.replace("GreetingView0(text)", generateGreetingViewLines())

composableFile.writeText(modifiedContent)

fun generateGreetingViewLines(): String {
    val greetingViewLines = (1..maxLine).joinToString("\n") { number ->
        "                        GreetingView$number(text)"
    }
    return "GreetingView0(text)\n$greetingViewLines\n"
}