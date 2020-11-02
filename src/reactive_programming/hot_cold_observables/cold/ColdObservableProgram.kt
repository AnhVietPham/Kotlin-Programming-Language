package reactive_programming.hot_cold_observables.cold

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.kotlin.toObservable

fun main() {
    val observable: Observable<String> = listOf("String 1", "String 2", "String 3", "String 4").toObservable()
    observable.subscribe(
            {
                println("Received $it")
            },
            {
                println("Error ${it.message}")
            },
            {
                println("Done")
            })

    observable.subscribe(
            {
                println("Received $it")
            },
            {
                println("Error ${it.message}")
            },
            {
                println("Done")
            })
}