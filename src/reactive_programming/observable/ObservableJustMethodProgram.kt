package reactive_programming.observable

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.kotlin.toObservable

fun main() {
    val observer: Observer<Any> = object : Observer<Any> {
        override fun onSubscribe(d: Disposable?) {
            println("New Subscription ")
        }

        override fun onNext(t: Any?) {
            println("Next $t")
        }

        override fun onError(e: Throwable?) {
            println("Error Occured ${e?.message}")
        }

        override fun onComplete() {
            println("All Completed")
        }
    }

    Observable.just("Anh Viet Pham").subscribe(observer)
    Observable.just(9999).subscribe(observer)
    Observable.just(listOf("Anh Viet Pham", "Anh Viet Pham 1", "Anh Viet Pham 3", "Anh Viet Pham 4")).subscribe(observer)

    Observable.just(mapOf(Pair("Key 1","Value 1"),Pair
    ("Key 2","Value 2"),Pair("Key 3","Value 3"))).subscribe(observer)
}