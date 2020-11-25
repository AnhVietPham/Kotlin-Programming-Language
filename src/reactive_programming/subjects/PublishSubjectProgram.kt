package reactive_programming.subjects

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.PublishSubject
import java.lang.StringBuilder
/*
*
* */
fun main() {
    val result1 = StringBuilder()
    val result2 = StringBuilder()

    val subject = PublishSubject.create<Char>()
    subject.subscribe {
        result1.append(it)
    }
    subject.onNext('V')
    subject.onNext('i')
    subject.onNext('e')
    subject.onNext('t')
    subject.subscribe{
        result2.append(it)
    }
    subject.onNext('H')
    subject.onNext('o')
    subject.onNext('a')
    subject.onNext('n')
    subject.onNext('g')

    subject.onComplete()
    println(result1)
    println(result2)
}