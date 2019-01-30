package extension

fun Double?.valueOrDefault(default: Double) : Double{
    return this ?: default
}

fun Double?.valueOrZero() : Double{
    return this.valueOrDefault(0.0)
}

fun main(args : Array<String>){
    val numberOne : Double? = null
    val numberTwo = numberOne.valueOrZero()
    System.out.println(numberOne)
    System.out.println(numberTwo)
}