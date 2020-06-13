package delegation

interface Base{
    fun print()
}

class BaseImpl(val x : Int) : Base{
    override fun print() {
        println(x)
    }
}

class Derived(b : Base) : Base by b

fun main() {
    val b = BaseImpl(4)
    Derived(b).print()

    val huskar = Huskar()
    println(huskar.getHeroType())
    println(huskar.getAttackType())
}