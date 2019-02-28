package variance.Factory

class FoodStore : ProductionFood<Food> {
    override fun produce(): Food {
        println("Food Store")
        return Food()
    }
}