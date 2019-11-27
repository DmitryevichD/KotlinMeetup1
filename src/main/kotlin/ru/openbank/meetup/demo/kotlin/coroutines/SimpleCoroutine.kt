package ru.openbank.meetup.demo.kotlin.coroutines

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    launch {
        delay(1000)
        println("Kotlin Coroutines World!")
    }
    println("Hello")
}
https://kotlinlang.org/docs/reference/coroutines/channels.html
Сравнения с Java
Концепция корутин
Типы корутин, билдеры
CoroutineContext
Акторы
Channel
Роман Елизаров