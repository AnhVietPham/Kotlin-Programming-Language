package dsl

fun main(args: Array<String>){
    val person = person1 {
        name = "John"
        age = 25
        address {
            street = "Main Street"
            number = 42
            city = "London"
        }
    }

    println(person)
}