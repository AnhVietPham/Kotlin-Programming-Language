package scopefunctions

/**
 * Context object is it.
 * Return Value
 * */

fun printNonNull(str: String?) {
    println("Printing \"$str\":")
    str?.let {
        println(it)
    }
}

fun main() {


    Person("David Luiz", 19, "0336910133", "Tan Thanh Bac Tan Uyen Binh Duong").let {
        println(it)
        it.moveTo("Ha Noi, Bac Giang")
        it.incrementAge()
        println(it)
        printNonNull(it.contactNumber)
        it.displayInfo()
    }

    println()

    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
    }

    val numbers1 = mutableListOf("one", "two", "three", "four", "five")
    numbers1.map { it.length }.filter { it > 3 }.let(::println)


}