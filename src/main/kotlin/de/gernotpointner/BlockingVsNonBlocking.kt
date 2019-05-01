package de.gernotpointner

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    GlobalScope.launch {
        println("Non-blocking call, before suspending delay")
        delay(1500L)
        println("Non-blocking call, after suspending delay")
    }
    println("From main thread")
    runBlocking {
        println("In blocking call, before delay")
        delay(2000L)
        println("In blocking call, after delay")
    }

}
