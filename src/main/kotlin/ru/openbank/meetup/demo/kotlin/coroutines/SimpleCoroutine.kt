package ru.openbank.meetup.demo.kotlin.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalDateTime
import java.util.concurrent.atomic.AtomicInteger

val counter: AtomicInteger = AtomicInteger(0)

fun main(args: Array<String>) {
    println("Start time: ${LocalDateTime.now()}")

    runBlocking {
        for (i in 0..1_000_000) {
            launch { coroutine() }
        }
    }

    println("Counter: $counter")
    println("End time: ${LocalDateTime.now()}")

}

suspend fun coroutine() {
    counter.incrementAndGet()
    delay(1000)
}
