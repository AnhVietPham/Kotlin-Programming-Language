package extension

// Default class and method is final
open class Animal{
    open fun getName(){
        println("This is Animal")
    }
}
fun Animal.getNewName() = "This is a New Animal"
class Dog : Animal() {
    override fun getName(){
        println("This is a Dog")
    }
}

fun Dog.getNewName() = "This is a New Dog"