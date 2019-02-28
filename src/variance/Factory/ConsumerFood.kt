package variance.Factory

interface ConsumerFood<in T>{
    fun consume(item : T)
}