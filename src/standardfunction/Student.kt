package standardfunction

class Student(
        var name: String? = null,
        var age: Int? = null,
        var school: String? = null,
        var address: String? = null
){
    fun getStudent(): Student? {
        return this
    }
}