package variance.Factory

interface ProductionConsumer<T> {
    fun produce(): T
    fun consume(item: T)
}