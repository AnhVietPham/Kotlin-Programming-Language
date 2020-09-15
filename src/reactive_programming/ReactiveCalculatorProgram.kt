package reactive_programming

import io.reactivex.rxjava3.subjects.PublishSubject
import io.reactivex.rxjava3.subjects.Subject
import java.util.*


class ReactiveCalculator(a: Int, b: Int) {
    internal val subjectAdd: Subject<Pair<Int, Int>> = PublishSubject.create()
    internal val subjectSub: Subject<Pair<Int, Int>> = PublishSubject.create()
    internal val subjectMul: Subject<Pair<Int, Int>> = PublishSubject.create()
    internal val subjectDiv: Subject<Pair<Int, Int>> = PublishSubject.create()

    internal val subjectCal: Subject<ReactiveCalculator> = PublishSubject.create()

    internal var nums: Pair<Int, Int> = Pair(0, 0)

    init {
        nums = Pair(a, b)
        subjectAdd.map {
            it.first + it.second
        }.subscribe {
            println("Add: $it")
        }

        subjectSub.map {
            it.first - it.second
        }.subscribe {
            println("Subtract: $it")
        }

        subjectMul.map {
            it.first * it.second
        }.subscribe {
            println("Multiply: $it")
        }

        subjectDiv.map {
            (it.first / (1.0 * it.second))
        }.subscribe {
            println("Divide: $it")
        }

        subjectCal.subscribe {
            with(it) {
                calculateAddition()
                calculateSubtraction()
                calculateMultiplication()
                calculateDivision()
            }
        }
    }

    private fun calculateAddition() {
        subjectAdd.onNext(nums)
    }

    private fun calculateSubtraction() {
        subjectSub.onNext(nums)
    }

    private fun calculateMultiplication() {
        subjectMul.onNext(nums)
    }

    private fun calculateDivision() {
        subjectDiv.onNext(nums)
    }

    fun modifyNumbers(a: Int = nums.first, b: Int = nums.second) {
        nums = Pair(a, b)
        subjectCal.onNext(this)
    }

}

fun main() {
    val read = Scanner(System.`in`)
    println("Input a = 20 and b = 30")
    val reactiveCalculator = ReactiveCalculator(20, 30)
    reactiveCalculator.modifyNumbers()
    var exit: String
    var numberOne: Int
    var numberTwo: Int
    do {
        print("Input number one: ")
        numberOne = read.nextInt()
        println()
        print("Input number two: ")
        numberTwo = read.nextInt()
        reactiveCalculator.modifyNumbers(numberOne, numberTwo)
        println("Can you quit program? Yes or No")
        exit = read.next()
    } while (exit != "Yes")

}