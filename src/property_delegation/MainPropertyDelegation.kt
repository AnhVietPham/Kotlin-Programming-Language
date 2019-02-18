package property_delegation

fun main(args: Array<String>) {
//    val demoPropertyDelegation = DemoPropertyDelegation()
//    println(demoPropertyDelegation.name)

    val demoLazy = DemoLazy()
    println("This is Student who has create by lazy Name: ${demoLazy.student.name}, School: ${demoLazy.student.school}")

    demoLazy.student.name = "Dennis Pham"
    demoLazy.student.school = "Le Loi High School"

    println("This is Student who has create by lazy Name: ${demoLazy.student.name}, School: ${demoLazy.student.school}")

    println("This is text which has created by lazy ${demoLazy.text}")
    println("This is text which has created by lazy ${demoLazy.text}")
}