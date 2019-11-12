package variance.Factory.store

import variance.Factory.ProductionFood
import variance.Factory.`object`.FastFood

class FastFoodStore : ProductionFood<FastFood> {
    override fun produce(): FastFood {
        println("Fast Food")
        return FastFood()
    }
}