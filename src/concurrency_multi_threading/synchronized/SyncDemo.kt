package concurrency_multi_threading.synchronized


fun main() {
    val sender = Sender()
    val threadSend1 = ThreadSend(" Hi ", sender)
    val threadSend2 = ThreadSend(" Bye ", sender)

    threadSend1.start()
    threadSend2.start()

    println("ThreadSend 1: ${threadSend1.isAlive}")
    println("ThreadSend 2: ${threadSend2.isAlive}")

    try {
        threadSend1.join()
        threadSend2.join()
        println("ThreadSend 1: ${threadSend1.isAlive}")
        println("ThreadSend 2: ${threadSend2.isAlive}")
    } catch (e: Exception) {
        println("Interrupted")
    }
}