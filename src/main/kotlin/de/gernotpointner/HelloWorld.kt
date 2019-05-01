package de.gernotpointner

import kotlinx.coroutines.*

fun main(args: Array<String>) {
    GlobalScope.launch {
        delay(1000L) // non-blocking, but suspends the coroutine
        println("After 1 second")
    }
    println("Immediately")
    Thread.sleep(3000L) // blocks the main thread, needed otherwise coroutine is terminated with JVM
}

