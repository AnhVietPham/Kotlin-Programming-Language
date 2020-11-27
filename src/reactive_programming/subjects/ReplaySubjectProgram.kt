package reactive_programming.subjects

import io.reactivex.rxjava3.subjects.ReplaySubject
/*
* It is more like Cold Observable;
* it will replay all the items it got, regardless of when Observer subscribes.
* */
fun main(){
    val subject = ReplaySubject.create<Int>()
    subject.onNext(1)
    subject.onNext(2)
    subject.subscribe({
        println("S3 Received $it")
    },{
        it.printStackTrace()
    },{
        println("S3 Complete")
    })
    subject.onNext(3)
    subject.onNext(4)
    subject.onNext(5)
    subject.subscribe({
        println("S1 Received $it")
    },{
        it.printStackTrace()
    },{
        println("S1 Complete")
    })
    subject.onNext(6)
    subject.onNext(7)
    subject.subscribe({
        println("S2 Received $it")
    },{
        it.printStackTrace()
    },{
        println("S2 Complete")
    })
}