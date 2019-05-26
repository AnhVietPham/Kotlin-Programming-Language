package variance.Factory.store

import variance.Factory.ProductionFood
import variance.Factory.`object`.Food

class FoodStore : ProductionFood<Food> {
    override fun produce(): Food {
        println("Food Store")
        return Food()
    }
}