package de.gernotpointner

import kotlinx.coroutines.*

fun main() = runBlocking {
    // this: scope of coroutine
    launch {
        // launch a new coroutine in the scope of blocking coroutine scope
        delay(2000L)
        println("in blocking")
    }

    println("Main")
    // coroutine does not return until all coroutines have been completed
}