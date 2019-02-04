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
    with(student) {
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

//Use the also() function, if your block does not access its receiver parameter at all, or if it does not mutate its receiver parameter
fun testFunStandardFunctionAlso() {
    val student = Student()
    student.also {
        println("Name: ${it.name}")
        println("Age: ${it.age}")
        println("Address: ${it.address}")
        println("School: ${it.school}")
    }
}

// Only access properties in apply block
fun testFunStandardFunctionApply() {
    val student = Student()

    println("Name: ${student.name}")
    println("Age: ${student.age}")
    println("Address: ${student.address}")
    println("School: ${student.school}")

    student.apply {
        name = "Hugo Lina"
        age = 34
        school = "University Of Science and Data"
        address = "District 12"
    }

    println("Name: ${student.name}")
    println("Age: ${student.age}")
    println("Address: ${student.address}")
    println("School: ${student.school}")
}


fun main(args: Array<String>) {
    //   testRunFunction()
  //  testNormalVsExtensionFuntion()
   // testFunStandardFunctionApply()
    testFunStandardFunctionAlso()
}