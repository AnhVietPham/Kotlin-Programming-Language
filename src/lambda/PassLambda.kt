package lambda


fun add(number1: Int, number2: (Int) -> Int): Int {
    return number2.invoke(number1)
}
fun main(args: Array<String>){
    val result = add(2){
        it + 5
    }

    val resultOfAnotherSyntax = add(3,{x -> x + 3})

    println(result)

    println(resultOfAnotherSyntax)
}