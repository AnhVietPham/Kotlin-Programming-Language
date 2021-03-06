package property_delegation

import kotlin.properties.Delegates

fun main(args: Array<String>) {
//    val demoPropertyDelegation = DemoPropertyDelegation()
//    println(demoPropertyDelegation.name)

//    val demoLazy = DemoLazy()
//    println("This is Student who has create by lazy Name: ${demoLazy.student.name}, School: ${demoLazy.student.school}")
//
//    demoLazy.student.name = "Dennis Pham"
//    demoLazy.student.school = "Le Loi High School"
//
//    println("This is Student who has create by lazy Name: ${demoLazy.student.name}, School: ${demoLazy.student.school}")
//
//    println("This is text which has created by lazy ${demoLazy.text}")
//    println("This is text which has created by lazy ${demoLazy.text}")

//    val demoObservable = DemoObservable()
//    demoObservable.name = "Anh Viet Pham"
//    demoObservable.name = "Huy Hoang Pham"

    var number : Int by Delegates.vetoable(0){
        property, oldValue, newValue ->
        println("Property = ${property.name}, OldValue = $oldValue, NewValue = $newValue")
        newValue >= 2
    }

    number = 1
    println(number)

    number = 2
    println(number)
}