package scopefunctions

/**
 * Because the context is referred as "This", so It cannot be renamed to readable lambda parameter.
 * */

fun printNonNullInRunScopeFunction(str: String?) {
    println("Printing \"$str\":")
    str?.let {
        println(it)
    }
}

fun main(){
    // don't apply filter list when use apply
//    val numbers = mutableListOf("One", "Two", "Three", "Four", "Five").apply {
//        filter { item ->
//            item.length > 4
//        }
//    }

//    Person("David Luiz", 19, "0336910133", "Tan Thanh Bac Tan Uyen Binh Duong").run {
//        println(this)
//        moveTo("Ha Noi, Bac Giang")
//        incrementAge()
//        println(this)
//        printNonNull(contactNumber)
//        displayInfo()
//    }
//
//    println()
//
//    val numbers = mutableListOf("One", "Two", "Three", "Four", "Five").run {
//        filter { item ->
//            item.length > 4
//        }
//    }
//
//    println(numbers)

    val personTwo : Person? = Person()
    println(personTwo)
    personTwo?.run {
        println(this)
        incrementAge()
        moveTo("American, Los angeles")
        changeContactNumber("0336910133")
    }
    println(personTwo)

    with(personTwo){
        this?.incrementAge()
        this?.moveTo("American, Los angeles, London is Chelsea")
        this?.changeContactNumber("0976291778")
    }

    println(personTwo)

    // run return lambda result
//    val personThree = Person().run {
//        incrementAge()
//        incrementAge()
//        incrementAge()
//        moveTo("Ha noi, Bac Giang")
//        changeContactNumber("1313682")
//    }
//
//    println(personThree)

    // with return lambda result
//    val personTwo = with(Person()){
//        this.incrementAge()
//        this.changeContactNumber("0336910133")
//        this.moveTo("London is Chelsea")
//    }


}