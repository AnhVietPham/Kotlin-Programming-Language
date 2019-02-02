package standardfunction


fun testRunFunction() {
    val mood = "I am sad"

    run {
        val mood = "I am Happy"
        println(mood) // I am  Happy
    }

    print(mood) // I am sad
}

fun testNormalVsExtensionFuntion() {
    val student = Student()
    with(student){
        name = "Huy Hoang Pham"
        address = "Tan Thanh Village"
        age = 20
        school = "Le Loi High School"
        println("Name: $name")
        println("Age: $age")
        println("Address: $address")
        println("School: $school")
    }
}


fun main(args: Array<String>) {
  //  testRunFunction()
    testNormalVsExtensionFuntion()
}