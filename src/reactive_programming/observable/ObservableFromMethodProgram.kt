package reactive_programming.observable

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import java.util.concurrent.Callable
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

fun main() {
    val observer: Observer<String> = object : Observer<String> {
        override fun onComplete() {
            println("All Completed")
        }

        override fun onNext(item: String) {
            println("Next $item")
        }

        override fun onError(e: Throwable) {
            println("Error Occured ${e.message}")
        }

        override fun onSubscribe(d: Disposable) {
            println("New Subscription ")
        }
    }

    val list = listOf("String 1", "String 2", "String 3", "String 4")
    val observableFromIterable: Observable<String> = Observable.fromIterable(list)
    observableFromIterable.subscribe(observer)

    val callable = Callable<String> {
        "From Callable"
    }

    val observableFromCallable: Observable<String> = Observable.fromCallable(callable)
    observableFromCallable.subscribe(observer)

    val future: Future<String> = object : Future<String> {
        override fun cancel(mayInterruptIfRunning: Boolean): Boolean = false

        override fun isCancelled(): Boolean = false

        override fun isDone(): Boolean = true

        override fun get(): String = "Hello From Future"

        override fun get(timeout: Long, unit: TimeUnit): String = "Hello From Future"

    }

    val observableFromFuture: Observable<String> = Observable.fromFuture(future)
    observableFromFuture.subscribe(observer)

}