package coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun longRunningTask(): Long {
    return measureTimeMillis {
        println("Please wait")
        delay(20000)
        println("Delay over")

    }
}

fun main() {
    // We are making the main thread wait here
//        runBlocking {
//            val exeTime = longRunningTask()
//            println("Executing time $exeTime")
//        }

    // To do asynchronous operations
    val time = GlobalScope.async { longRunningTask() }
    println("Print after async")
    runBlocking {
        println("Printing time ${time.await()}")
    }
}