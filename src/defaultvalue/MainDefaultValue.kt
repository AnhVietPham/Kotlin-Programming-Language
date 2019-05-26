package defaultvalue

fun sayHello(first: String? = "Pham", last: String? = "Anh Viet"){
    println("Hello $first $last")
}


fun main(args: Array<String>) {
    // Have parameter
    sayHello(first = "Hugo",last = "LinDa")

    // pass null parameter
    sayHello(first = null, last = null)

    // Have no parameter
    sayHello()

    // Have one parameter
    sayHello(first = "Chelsea")
}