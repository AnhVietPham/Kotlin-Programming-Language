package scopefunctions

import extension.valueOrEmpty

fun printMessage(age: Int) {
    println("Toi da $age. Toi lon roi")
}

fun createPerson(age: Int, name: String, contactNumber: String, address: String) = Person().apply {
    this.name = name
    this.age = age
    this.contactNumber = contactNumber
    this.address = address
}

fun createPersonNoUseApply(age: Int, name: String, contactNumber: String, address: String): Person {
    val person = Person()
    person.age = age
    person.name = name
    person.contactNumber = contactNumber
    person.address = address
    return person
}

fun main() {
//    val person: Person? = Person()
    /*
    * Scope Function: let
    * */
    // Don't create Object from let
//    val person1 = Person().let {
//        println(it)
//        it.incrementAge()
//        it.incrementAge()
//        it.changeContactNumber("0706000050")
//        it.moveTo("Thua Thien Hue")
//        print(it)
//    }
//
//    println("\nOutScope: $person1")

//    val age = person?.let {
//        if (it.age > 0) {
//            printMessage(it.age)
//            return@let it.age
//        } else {
//            return@let 100
//        }
//    }
//    println(age)
//
//    val listAge = listOf(1, 2, 3, 4, 5, 6, 7, 8)
//    val total = listAge.filter { item ->
//        item % 2 == 0
//    }.let {
//        println(it)
//        it.sum()
//    }
//
//    println(total)

    /*
    * Scope function: run
    * */

//    person?.run {
//        name = "Pham Le Huy Hoang"
//        age = 35
//        contactNumber = "0704000060"
//        address = "London is Chelsea"
//        displayInfo()
//    }

//    val person1 = Person().run {
//        println(this)
//        this.incrementAge()
//        this.incrementAge()
//        this.changeContactNumber("0706000050")
//        this.moveTo("Thua Thien Hue")
//        print(this)
//    }
//    val person1 = Person()
//    person1.run {
//        println(this)
//        this.incrementAge()
//        this.incrementAge()
//        this.changeContactNumber("0706000050")
//        this.moveTo("Thua Thien Hue")
//    }
//    println()
//    println(person1)
//
//    val age = person?.run {
//        if (age > 0) {
//            printMessage(age)
//            return@run age
//        } else {
//            return@run 100
//        }
//    }
//    println(age)
//
//    val listAge = listOf(1, 2, 3, 4, 5, 6, 7, 8)
//    val total = listAge.filter { item ->
//        item % 2 == 0
//    }.run {
//        println(this)
//        sum()
//    }
//
//    println(total)

    /*
    * Scope function: with
    * */

//    val person1 = Person()
//    with(person1){
//        println(this)
//        this.incrementAge()
//        this.incrementAge()
//        this.changeContactNumber("0706000050")
//        this.moveTo("Thua Thien Hue")
//    }
//
//    println(person1)
//    person1.incrementAge()
//    person1.incrementAge()
//    person1.changeContactNumber("0706000050")
//    person1.moveTo("Thua Thien Hue")
//
//
//
//    println()
//    println(person1)
//
//        val age = with(person!!){
//        if (age > 0) {
//            printMessage(age)
//            return@with age
//        } else {
//            return@with 100
//        }
//    }
//    println(age)

    /*
    * Scope function: apply
    * */
//    val person3 = Person().apply {
//        name = "Pham Le Huy Hoang"
//        age = 35
//        contactNumber = "0704000060"
//        address = "London is Chelsea"
//    }
//
    println()
//    println(person3)
//    println(createPerson(age = 18, name = "Eden", contactNumber = "090800000", address = "TAN THAN, BAC TAN UYEN, BINH DUONG"))
//    println(createPersonNoUseApply(age = 18, name = "Eden", contactNumber = "090800000", address = "TAN THAN, BAC TAN UYEN, BINH DUONG"))

    /*
    * Scope function: also
    * */
//    val person5 : Person? = Person()
//    person5.also {
//        it?.let {
//
//        }
//    }
    val personUseAlso = Person().also { person ->
        person.name = "Pham Anh Viet"
        person.age = 22
        person.contactNumber = "0506000034"
        person.address = "Thi tran TAN THANH, Huyen Bac Tan Uyen, Binh Duong"
    }

    println(personUseAlso)



}



