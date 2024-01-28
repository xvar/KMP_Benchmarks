package com.example.kmp_sample_gen

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform