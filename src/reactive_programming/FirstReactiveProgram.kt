package reactive_programming

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.kotlin.subscribeBy
import io.reactivex.rxjava3.kotlin.toObservable

fun main() {
    val list: List<Any> = listOf("One", 2, "Three", "Four", 4.5,
            "Five", 6.0f) // 1
    val iterator = list.iterator() // 2
    while (iterator.hasNext()) { // 3
        println(iterator.next()) // Prints each element 4
    }

    println("This time with observable:")

    val observable: Observable<Any> = list.toObservable()
    observable.subscribeBy(
            onNext = {
                println(it)
            },
            onComplete = {
                println("Done!")
            },
            onError = {
                it.printStackTrace()
            }
    )
}