package reactive_programming.observable

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

fun main(){
    /*
    * Understanding the Observable.create method
    * */

    val observer1: Observer<String> = object : Observer<String> {
        override fun onSubscribe(d: Disposable?) {
            println("Observer1: New Subscription ")
        }

        override fun onNext(t: String?) {
            println("Observer1: Next $t")
        }

        override fun onError(e: Throwable?) {
            println("Observer1: Error Occured ${e?.message}")
        }

        override fun onComplete() {
            println("Observer1: All Completed")
        }
    }

    val observer2: Observer<String> = object : Observer<String> {
        override fun onSubscribe(d: Disposable?) {
            println("Observer2: New Subscription ")
        }

        override fun onNext(t: String?) {
            println("Observer2: Next $t")
        }

        override fun onError(e: Throwable?) {
            println("Observer2: Error Occured ${e?.message}")
        }

        override fun onComplete() {
            println("Observer2: All Completed")
        }
    }

    val observable1: Observable<String> = Observable.create<String> {
        it.onNext("Anh Viet Pham")
        it.onNext("Anh Viet Pham 1")
        it.onNext("Anh Viet Pham 2")
        it.onNext("Anh Viet Pham 3")
        it.onNext("Anh Viet Pham 4")
        it.onNext("Anh Viet Pham 5")
        it.onComplete()
    }

    observable1.subscribe(observer1)
    observable1.subscribe(observer2)

    val observable2: Observable<String> = Observable.create<String> {
        it.onNext("Anh Viet Pham")
        it.onNext("Anh Viet Pham 1")
        it.onNext("Anh Viet Pham 2")
        it.onNext("Anh Viet Pham 3")
        it.onNext("Anh Viet Pham 4")
        it.onNext("Anh Viet Pham 5")
        it.onError(Throwable("My Custom Exception"))
    }
    observable2.subscribe(observer1)
    observable2.subscribe(observer2)
}