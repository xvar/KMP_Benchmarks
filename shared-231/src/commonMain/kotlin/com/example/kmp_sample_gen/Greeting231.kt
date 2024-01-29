package com.example.kmp_sample_gen

import kotlin.random.Random

class Greeting231 {
    //private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${Random(500).nextInt()}!"
    }
}