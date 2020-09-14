package coroutine

import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main(){

    /*
    * Non-blocking and blocking
    * */
    GlobalScope.launch {
        delay(1000L)
        println("Coroutine!")
    }
    println("Hello, ")
    Thread.sleep(2000L)
    println("Hello AVP")

//    GlobalScope.launch {
//        delay(1000L)
//        println("World!")
//    }
//
//    println("Hello, ")
//
//    runBlocking {
//        delay(2000L)
//    }
}