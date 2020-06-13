package lambda

fun main() {
    val add = {x : Int -> x + 1 }
    println(add(4))

    println("Invoke = ${add.invoke(2)}")

    println("Anonymous Invocation = ${{ x: Int -> x + 4 }(2)}")
}