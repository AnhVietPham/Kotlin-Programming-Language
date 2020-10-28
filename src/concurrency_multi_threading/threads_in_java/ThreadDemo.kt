package concurrency_multi_threading.threads_in_java


fun main() {
    val threads = mutableListOf<Thread>()

    for (i in 0..9) {
        val task: Runnable = MyRunnable(5L,"Thread $i")
        val worker = Thread(task)
        // We can set the name of the thread
        worker.name = i.toString()
        // Start the thread, never call method run() direct
        worker.start()
        // Remember the thread for later usage
        threads.add(worker)
    }

    var running = 0
    do {
        running = 0
        for (thread in threads) {
            if (thread.isAlive) {
                running++
            }
        }
        println("We have $running running threads. ")
    } while (running > 0)
}