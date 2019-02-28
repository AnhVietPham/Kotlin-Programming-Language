package variance.Factory

class BurgerStore : ProductionFood<Burger> {
    override fun produce(): Burger {
        println("Burger")
        return Burger()
    }
}