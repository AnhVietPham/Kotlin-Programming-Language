package reactive_programming

import io.reactivex.rxjava3.subjects.PublishSubject
import io.reactivex.rxjava3.subjects.Subject
import java.util.function.Consumer


fun isEven(number: Int): Boolean{
    return number % 2 == 0
}

fun main(){
    val subject: Subject<Int> = PublishSubject.create()

    subject.map {
        isEven(it)
    }.subscribe{
        println("This number is ${if (it) "EVEN" else "ODD"}")
    }

    subject.onNext(4)
    subject.onNext(7)
}
