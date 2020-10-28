package concurrency_multi_threading.synchronized


class ThreadSend(var msg: String, var sender: Sender) : Thread() {

    override fun run() {
        sender.send(msg)

    }
}