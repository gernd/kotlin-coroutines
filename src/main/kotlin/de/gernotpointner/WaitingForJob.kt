package de.gernotpointner

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>){

    runBlocking {
        println("Main started")
        val jobToWaitFor = GlobalScope.launch {
            println("Job started")
            delay(2000L)
            println("Job finished")
        }
        jobToWaitFor.join() // non-blocking, but suspending
    }
    println("After runBlocking scope")
}