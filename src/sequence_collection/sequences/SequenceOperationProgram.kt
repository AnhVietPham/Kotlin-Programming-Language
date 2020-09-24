package sequence_collection.sequences


/*
* https://kotlinlang.org/docs/reference/sequences.html
* https://medium.com/androiddevelopers/collections-and-sequences-in-kotlin-55db18283aca
* https://stackoverflow.com/questions/55129988/understanding-kotlins-yield-function
* https://kotlinlang.org/docs/reference/sequences.html
* */
fun main() {
    val oddNumbers = sequence {
        yield(1)
        yieldAll(listOf(3, 5))
//        yieldAll(generateSequence(7) { it + 2 })
    }
    println(oddNumbers.take(5).toList())
}