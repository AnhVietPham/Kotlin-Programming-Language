package variance.Factory.consumer

import variance.Factory.ConsumerFood
import variance.Factory.`object`.Food

class American : ConsumerFood<Food> {
    override fun consume(item: Food) {
        println("Eat burger")
    }
}