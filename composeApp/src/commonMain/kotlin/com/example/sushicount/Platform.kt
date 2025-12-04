package com.example.sushicount

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform