package defaultvalue

import java.text.DecimalFormat

fun sayHello(first: String? = "Pham", last: String? = "Anh Viet") {
    println("Hello $first $last")
}


fun isNullOrEmpty(str: String?): Boolean {
    return null == str || str.isEmpty()
}

fun formatCurrency(number: String? = ""): String? {
    var sNumber = number ?: "0"
    return if (isNullOrEmpty(number)) {
        ""
    } else {
        try {

            sNumber = DecimalFormat("###,###,###").format(java.lang.Double.parseDouble(sNumber))
                    ?: ""
        } catch (e: NumberFormatException) {
            e.printStackTrace()
        }
        sNumber
    }
}

fun formatCurrencyToKOrPercent(number: Int?): String? {
    return if ((number ?: 0) <= 100) {
        number?.toString() + "%"
    } else {
        if (number ?: 0 >= 1000000) {
            val numberK = number?.rem(1000000)
            if (numberK ?: 0 == 0) {
                number?.div(1000000).toString() + "Tr"
            } else {
                (number?.div(1000000F).toString() + "Tr").replace(".", ",")
            }
        } else {
            val numberK = number?.rem(1000)
            if (numberK ?: 0 == 0) {
                number?.div(1000).toString() + "K"
            } else {
                (number?.div(1000F).toString() + "K").replace(".", ",")
            }
        }
    }
}

fun main() {
//    // Have parameter
//    sayHello(first = "Hugo", last = "LinDa")
//
//    // pass null parameter
//    sayHello(first = null, last = null)
//
//    // Have no parameter
//    sayHello()
//
//    // Have one parameter
//    sayHello(first = "Chelsea")
    val person = Person(firstName = "Anh Viet Pham")
    println("FirstName: ${person.firstName}, lastName: ${person.lastName}, age: ${person.age}, address: ${person.address}")
    println(formatCurrencyToKOrPercent(number = 1500500))
}