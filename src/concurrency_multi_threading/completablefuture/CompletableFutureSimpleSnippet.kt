package concurrency_multi_threading.completablefuture

import java.util.concurrent.CompletableFuture


fun main() {
    val futureResult = CompletableFuture<Double>()
    Thread {
        try {
            //some long process
            futureResult.complete(10.0)
        } catch (e: Exception) {
            futureResult.completeExceptionally(e)
        }
    }.start()
}