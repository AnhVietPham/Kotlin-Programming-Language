package inlinefunction


/**
 * A normal function without inlining
 * */
fun notInlinedFilter(list : List<Int>, predicate : (Int) -> Boolean) : List<Int>{
    return list.filter(predicate)
}

fun filterLessThanTwo(input: Int) = input < 2

fun lambdaInstance(predicate: (Int) -> Boolean) {
    val list = listOf(1,2,3)
    val newList = notInlinedFilter(list, predicate)
    println(newList)
}

fun lambdaInstanceTest() {
    lambdaInstance(::filterLessThanTwo)
}


fun main() {
//    notInlinedTest()
    lambdaInstanceTest()
}