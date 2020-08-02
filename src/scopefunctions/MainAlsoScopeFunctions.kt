package scopefunctions

/*
* The context object is available as an argument (it). The return value is the object itself
* */
fun main() {
    val numbers = mutableListOf("one", "two", "three")
    numbers.also { println("The list elements before adding new one: $it") }.add("four")
    println(numbers)

    val person = Person().also {
        println(it)
        it.moveTo("Ha Noi, Bac Giang")
        it.changeContactNumber("0976291778")
        it.incrementAge()
        it.incrementAge()
        println(it)
    }

    println(person)


}