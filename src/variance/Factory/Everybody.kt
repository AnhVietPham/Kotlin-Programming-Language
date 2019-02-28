package variance.Factory

class Everybody : ConsumerFood<Food>{
    override fun consume(item: Food) {
        println("Eat food")
    }
}