package variance.Factory

class American : ConsumerFood<Food>{
    override fun consume(item: Food) {
        println("Eat burger")
    }
}