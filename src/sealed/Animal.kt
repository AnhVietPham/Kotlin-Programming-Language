package sealed

sealed class Animal(val name: String, val age: Int) {
    open fun sleep(hour: Int) {
        println("$name am sleeping ${hour}h!")
    }

    open fun eat(kg: Int) {
        println("$name is eating ${kg}kg!")
    }

    open fun play(sport: String) {
        println("$name is playing $sport!")
    }

}

class Cat(var nameCat: String, var ageCat: Int) : Animal(name = nameCat, age = ageCat){
    override fun sleep(hour: Int) {
        super.sleep(hour)
        println("I am $nameCat")
    }
}

