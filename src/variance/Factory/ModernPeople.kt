package variance.Factory

class ModernPeople : ConsumerFood<Food>{
    override fun consume(item: Food) {
        println("Eat fast food")
    }
}