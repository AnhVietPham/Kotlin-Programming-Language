package concurrency_multi_threading.synchronized

class Sender {
    fun send(msg: String) {
        // Only one thread can send a message
        // at a time.
        // synchronizing the snd object
        synchronized(this) {
            println("Sending\t$msg")
            try {
                Thread.sleep(1000)
            } catch (e: Exception) {
                println("Thread  interrupted.")
            }
            println("\n" + msg + "Sent")
        }

    }
}