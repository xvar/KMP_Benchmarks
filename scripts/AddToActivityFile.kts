#!/usr/bin/env kotlin

import java.io.File

val maxLine = 10
val composableFile = File("androidApp/src/main/java/com/example/kmp_sample_gen/android/MainActivity.kt")
val existingContent = composableFile.readText()

val modifiedContent = existingContent.replace("GreetingView(Greeting().greet())", generateGreetingViewLines())

composableFile.writeText(modifiedContent)

fun generateGreetingViewLines(): String {
    val greetingViewLines = (1..maxLine).joinToString("\n") { number ->
        "                        GreetingView(Greeting$number().greet())"
    }
    return "GreetingView(Greeting().greet())\n$greetingViewLines\n"
}