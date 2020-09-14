package reactX

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.kotlin.subscribeBy
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

fun startWithTimerOperator() {
    Observable.create<String> { emitter ->
        println("Test timer: Start")
        emitter.onNext("Anh Viet Pham")
        emitter.onComplete()
    }.delay(10, TimeUnit.SECONDS, Schedulers.io()).subscribe { value -> println(value)}
}

fun main() {
    startWithTimerOperator()


}