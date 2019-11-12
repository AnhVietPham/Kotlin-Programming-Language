package variance.Factory.store

import variance.Factory.ProductionFood
import variance.Factory.`object`.Burger

class BurgerStore : ProductionFood<Burger> {
    override fun produce(): Burger {
        println("Burger")
        return Burger()
    }
}