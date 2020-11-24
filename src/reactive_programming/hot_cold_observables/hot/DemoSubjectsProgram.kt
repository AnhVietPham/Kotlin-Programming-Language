package reactive_programming.hot_cold_observables.hot

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.PublishSubject
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.util.concurrent.TimeUnit

fun main(){
    val observable = Observable.interval(1000, TimeUnit.MILLISECONDS)
    val subject = PublishSubject.create<Long>()
    observable.subscribe(subject)
    subject.subscribe {
        println("Received $it")
    }
    runBlocking { delay(11000) }
}