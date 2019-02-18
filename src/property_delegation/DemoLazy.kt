package property_delegation
/*
* Lazy properties: the value gets computed only upon first access;
* We have a “lazily initialized” filed and it’s created only once
* */
class DemoLazy{
    data class Student(var name: String,
                       var school: String)

    val student: Student by lazy {
        Student(name = "AVP", school = "KHTN") }

    val text: String by lazy {
        println("This is Lazy")
        "Create Lazy"
    }
}