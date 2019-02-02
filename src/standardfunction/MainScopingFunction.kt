package standardfunction


fun test() {
    val mood = "I am sad"

    run {
        val mood = "I am Happy"
        println(mood) // I am  Happy
    }

    print(mood) // I am sad
}


fun main(args: Array<String>) {
    test()
}