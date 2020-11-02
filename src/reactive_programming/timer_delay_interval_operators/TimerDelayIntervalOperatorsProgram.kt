package reactive_programming.timer_delay_interval_operators

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.util.concurrent.TimeUnit


fun main() {
    runBlocking {
        val observable: Observable<Long> = Observable.interval(100, TimeUnit.MILLISECONDS)
        val observer: Observer<Long> = object : Observer<Long> {
            lateinit var disposable: Disposable
            override fun onSubscribe(d: Disposable) {
                println("Subscribe")
                disposable = d
            }

            override fun onNext(item: Long) {
                println("Received $item")
                if (item >= 10 && !disposable.isDisposed) {
                    disposable.dispose()
                    println("Disposed")
                }
            }

            override fun onError(e: Throwable) {
                println("Error ${e.message}")
            }

            override fun onComplete() {
                println("Complete")
            }
        }
        observable.subscribe(observer)
        delay(1500)
    }
}