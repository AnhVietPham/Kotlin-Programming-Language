package reactive_programming.subjects

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.AsyncSubject
import io.reactivex.rxjava3.subjects.PublishSubject
import java.lang.StringBuilder
/*
* PublishSubject emits all subsequent values that it got at the time of subscription,
* whether it got the value via the onNext method or through another subscription.
* */
fun main() {
//    val result1 = StringBuilder()
//    val result2 = StringBuilder()
//
//    val subject = PublishSubject.create<Char>()
//    subject.subscribe {
//        result1.append(it)
//    }
//    subject.onNext('V')
//    subject.onNext('i')
//    subject.onNext('e')
//    subject.onNext('t')
//    subject.subscribe{
//        result2.append(it)
//    }
//    subject.onNext('H')
//    subject.onNext('o')
//    subject.onNext('a')
//    subject.onNext('n')
//    subject.onNext('g')
//
//    subject.onComplete()
//    println(result1)
//    println(result2)

    val subject = PublishSubject.create<Int>()
    subject.subscribe({
        println("S1 Received $it")
    }, {
        it.printStackTrace()
    }, {
        println("S1 Complete")
    })
    subject.onNext(1)
    subject.onNext(2)
    subject.onNext(3)
    subject.onNext(4)
    subject.subscribe({
        println("S2 Received $it")
    }, {
        it.printStackTrace()
    }, {
        println("S2 Complete")
    })
    subject.onNext(5)
    subject.onComplete()
}