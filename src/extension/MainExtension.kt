package extension

fun Double?.valueOrDefault(default: Double) : Double{
    return this ?: default
}

fun Double?.valueOrZero() : Double{
    return this.valueOrDefault(0.0)
}

fun main(args : Array<String>){
//    val numberOne : Double? = null
//    val numberTwo = numberOne.valueOrZero()
//    System.out.println(numberOne.valueOrDefault(3.0))
//    System.out.println(numberTwo)
    val animal = Animal()
    val dog = Dog()
    animal.getName()
    dog.getName()
    println(animal.getNewName())
    println(dog.getNewName())
}