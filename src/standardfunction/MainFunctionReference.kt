package standardfunction

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOddFunctionReference))
    println(numbers.filter(isOddValueOfFunctionType))
}

fun isOddFunctionReference(x: Int) = x % 2 != 0
val isOddValueOfFunctionType : (Int) -> Boolean = {
    it % 2 != 0
} // Or = ::isOddFunctionReference refers to isOddFunctionReference(x: Int)
