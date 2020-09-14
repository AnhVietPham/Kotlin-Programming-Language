package backingField

/*
* Field ==> is just a class member variable that hold a value. It can be read-only
*   or mutable and marked with any access modifier such as public or private.
* Property ==> is more complex element that contain a private field and accessors.
*   By accessors I mean getter and setter. Property can also be read-only or mutable.
* ==> Read-only property = private field + getter
* ==> Mutable property = private field + getter + setter
* */
class User(_id: Int, _name: String, _age: Int, _celsius: Float) {
    val id: Int = _id
        get() = field + 10

    val fahrenheit : Float = _celsius
        get() =  field + 273.15f

    var name: String = _name
        // Custom Getter
        get() {
            return field.toUpperCase()
        }

    var age: Int = _age
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Age must be greater than zero")
        }
}