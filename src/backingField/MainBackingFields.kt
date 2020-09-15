package backingField

fun main(){
    val user = UserBackingProperties(_age = 18, _name = "Anh Viet Pham", _celsius = 100F, _id = 99)
    println(user.age)
    println(user.name)
    user.name = "Pham Le Huy Hoang"
    println(user.age)
    println(user.name)
    println(user.fahrenheit)
}

