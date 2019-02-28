package variance.Factory

interface ProductionFood<out T>{
    fun produce() : T
}