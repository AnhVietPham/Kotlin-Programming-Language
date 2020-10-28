package concurrency_multi_threading.threads_threads_pool

import java.text.SimpleDateFormat
import java.util.*


class MyRunnable(private val countUntil: Long, val nameThread: String) : Runnable {
    override fun run() {
        for (i in 0 until countUntil) {
            if (i == 0L) {
                val d = Date()
                val ft = SimpleDateFormat("hh:mm:ss")
                println("Initialization Time for"
                        + " task name - " + nameThread + " = " + ft.format(d))
                //prints the initialization time for every task
            } else {
                val d = Date()
                val ft = SimpleDateFormat("hh:mm:ss")
                println("Executing Time for task name - " +
                        nameThread + " = " + ft.format(d))
                // prints the execution time for every task
            }
            Thread.sleep(1000)
        }
        println("Name: $nameThread Complete")
    }
}