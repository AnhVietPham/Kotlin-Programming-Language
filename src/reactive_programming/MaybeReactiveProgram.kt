package reactive_programming

import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.kotlin.subscribeBy

fun main() {
    val maybeValue: Maybe<Int> = Maybe.just(14)
    maybeValue.subscribeBy(
            onComplete = {
                println("Completed Empty")
            },
            onError = {
                println("Error $it")
            },
            onSuccess = {
                println("Completed with value $it")
            }
    )

    val maybeEmpty: Maybe<Int> = Maybe.empty()//3
    maybeEmpty.subscribeBy(
            onComplete = { println("Completed Empty") },
            onError = { println("Error $it") },
            onSuccess = { println("Completed with value $it") }
    )
}