package concurrency_multi_threading.threads_in_java

class MyRunnable(private val countUntil: Long, val nameThread: String) : Runnable {
    override fun run() {
        var sum: Long = 0
        for (i in 1 until countUntil) {
            sum += i
        }
        println("Sum: $sum, Name: $nameThread")
    }
}