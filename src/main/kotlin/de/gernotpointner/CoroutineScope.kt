package de.gernotpointner

import kotlinx.coroutines.*

fun main() = runBlocking { // this: CoroutineScope
    launch {
        println("Before delay in runBlocking")
        delay(1000L)
        println("After delay in runBlocking")
    }

    coroutineScope{
       println("Start of coroutine scope")
        launch {
            println("Task from launch in scope before delay")
            delay(1500L)
            println("Task from launch in scope after delay")
        }

        println("End of coroutine scope")
    }
    delay(500L)

    println("End of coroutine scope")
}