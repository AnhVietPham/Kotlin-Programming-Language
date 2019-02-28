package variance.Factory

class FastFoodStore : ProductionFood<FastFood> {
    override fun produce(): FastFood {
        println("Fast Food")
        return FastFood()
    }
}