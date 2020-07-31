package scopefunctions

/**
 * the context object is passed as an argument,
 * but inside the lambda, it's available as a receiver (this).
 * The return value is the lambda result.
 * */

fun main() {
//    val numbers = mutableListOf("one", "two", "three")
//    with(numbers) {
//        println("'with' is called with argument $this")
//        println("It contains $size elements")
//    }
//
//    val numbers1 = mutableListOf("one", "two", "three")
//    val firstAndLast = with(numbers1) {
//        "The first element is ${first()}," +
//                " the last element is ${last()}"
//    }
//    println(firstAndLast)

    val personOne = Person()
    println(personOne)
    with(personOne){
        incrementAge()
        changeContactNumber("0336910133")
        moveTo("Huong Dien, Thua Thien Hue")
    }
    println(personOne)
}