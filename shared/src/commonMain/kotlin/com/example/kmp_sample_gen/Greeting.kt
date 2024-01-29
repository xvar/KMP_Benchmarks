package com.example.kmp_sample_gen

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, $platform!"
    }
}