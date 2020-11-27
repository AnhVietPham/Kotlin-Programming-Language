package reactive_programming.subjects

import io.reactivex.rxjava3.subjects.AsyncSubject
/*
* On Subject instances, you can pass values directly with the onNext method,
* without subscribing to any Observable.
* */
fun main() {
    /*
    * AsyncSubject will emit the last value it got, and will emit it only one time.
    * */
//    val observable = Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9)
//    val subject = AsyncSubject.create<Int>()
//    observable.subscribe(subject)
//    subject.subscribe({
//        //onNext
//        println("Received $it")
//    }, {
//        //onError
//        it.printStackTrace()
//    }, {
//        //onComplete
//        println("Complete")
//    })

    val subject = AsyncSubject.create<Int>()
    subject.onNext(1)
    subject.onNext(2)
    subject.onNext(3)
    subject.onNext(4)
    subject.subscribe({
        println("S1 Received $it")
    }, {
        it.printStackTrace()
    }, {
        println("S1 Complete")
    })
    subject.onNext(5)
    subject.subscribe({
        println("S2 Received $it")
    }, {
        it.printStackTrace()
    }, {
        println("S2 Complete")
    })
    subject.onComplete()

}