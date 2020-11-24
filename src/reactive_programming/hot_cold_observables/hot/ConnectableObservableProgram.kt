package reactive_programming.hot_cold_observables.hot

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.kotlin.toObservable
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.util.concurrent.TimeUnit

fun main() {
//    val connectableObservable = listOf(
//            "String 1",
//            "String 2",
//            "String 3",
//            "String 4",
//            "String 5"
//    ).toObservable().publish()
//
//    connectableObservable.subscribe {
//        println("Subscription 1: $it")
//    }
//
//    connectableObservable.map(String::reversed).subscribe { println("Subscription 2 $it") }
//
//    connectableObservable.connect()
//
//    connectableObservable.subscribe { println("Subscription 3: $it") }

    val connectableObservable = Observable.interval(100, TimeUnit.MILLISECONDS).publish()
    connectableObservable.subscribe { println("Subscription 1: $it") }
    connectableObservable.subscribe { println("Subscription 2 $it") }
    connectableObservable.connect()
    runBlocking { delay(400) }
//    connectableObservable.subscribe { println("Subscription 3: $it") }
//    runBlocking { delay(500) }

}