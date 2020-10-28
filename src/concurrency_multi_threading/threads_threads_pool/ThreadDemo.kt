package concurrency_multi_threading.threads_threads_pool

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


fun main() {
    val NTHREDS = 10
   // val threads = mutableListOf<Thread>()
//
//    for (i in 0..9) {
//        val task: Runnable = MyRunnable(5L, "Thread $i")
//        val worker = Thread(task)
//        // We can set the name of the thread
//        worker.name = i.toString()
//        // Start the thread, never call method run() direct
//        worker.start()
//        // Remember the thread for later usage
//        threads.add(worker)
//    }
//
//    var running = 0
//    do {
//        running = 0
//        for (thread in threads) {
//            if (thread.isAlive) {
//                running++
//            }
//        }
//        println("We have $running running threads. ")
//    } while (running > 0)

    // Threads pools with Executor
    val executor = Executors.newFixedThreadPool(5)
    for (i in 0..9) {
        val worker: Runnable = MyRunnable(5L, "Thread $i")
        executor.execute(worker)
    }
    // This will make the executor accept no new threads
    // and finish all existing threads in the queue
    // This will make the executor accept no new threads
    // and finish all existing threads in the queue
    executor.shutdown()
    // Wait until all threads are finish
    // Wait until all threads are finish
    executor.awaitTermination(60, TimeUnit.SECONDS)
    println("Finished all threads")
}