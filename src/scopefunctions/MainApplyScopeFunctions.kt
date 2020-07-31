package scopefunctions

/**
 * The context object is available as a receiver (this).
 * The return value is the object itself.
 * */
fun main() {

    val luis = Person()
    println(luis)

    luis.apply {
        changeContactNumber("097822348")
        moveTo("Quan 3, Thanh pho Ho Chi Minh")
        incrementAge()
        incrementAge()
        incrementAge()
    }

    println(luis)

    println("========================")

    val david : Person? = Person()

    println(david)

    david?.apply {
        incrementAge()
        incrementAge()
        moveTo("Bac Giang, Phu Xuan, Tay Son")
        changeContactNumber("0974285130")
    }

    println(david)

    println("========================")

    val eden = Person().apply {
        name = "Eden Harzad"
        address = "LonDon is Chelsea"
        contactNumber = "0976291778"
        age = 21
    }
    println(eden)

    println("========================")


    // don't apply filter list when use apply. Return Object
    val numbers1 = mutableListOf("One", "Two", "Three", "Four", "Five").apply {
        println(this)
        val number2 = this.filter { item ->
            item.length > 4
        }
        println(number2)
    }

    println(numbers1)

    println("========================")

    // Return lambda result
    val numbers = mutableListOf("One", "Two", "Three", "Four", "Five").let {
        it.filter { item ->
            item.length > 4
        }
    }

    println(numbers)
}