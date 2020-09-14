package inlinefunction

fun higherFunc(str: String, myFunc: (String) -> Unit) {
    myFunc(str)
}

inline fun higherFuncVer2(str: String, myFunc: (String) -> Unit) {
    myFunc(str)
}

inline fun inlinedFunc(lambda1: () -> Unit, lambda2: () -> Unit) {
    lambda1()
    lambda2()
}

/**
 * A normal function without inlining
 * */

fun notInlinedFilter(list: List<Int>, predicate: (Int) -> Boolean): List<Int> {
    return list.filter(predicate)
}

fun notInlinedTest() {
    val list = listOf(1, 2, 3)
    val newList = notInlinedFilter(list) { it < 2 }
    println(newList)
}

/**
 * A function with inlining
 * */

inline fun inlinedFilter(list : List<Int>, predicate : (Int) -> Boolean) : List<Int>{
    return list.filter(predicate)
}

fun lambdaInCallSiteTest() {
    val list = listOf(1,2,3)
    val newList = inlinedFilter(list) {it < 2}
    println(newList)
}

fun main() {

    notInlinedTest()
    lambdaInCallSiteTest()
//    print("Anh Viet Pham: ")
//    higherFunc("Super Hero",::print)
//
//    println()
//
//    print("Huy Hoang Le Pham: ")
//    higherFuncVer2("Super Hero",::print)

//    println("Main function starts")
//
//    inlinedFunc({
//        println("Lambda expression 1")
//        return
//    }, { println("Lambda expression 2") })
//
//
//    println("Main function ends")
}