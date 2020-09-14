package backingField

class StudentBackingFields {
    /*
    * Backing fields
    * */
    val age = 20
        get() {
            println("Age is: $field")
            return field
        }

    var name = "Anh Viet Pham"
        set(value) {
            if (value.isNotEmpty()){
                field = value
            }
        }
        get() {
            println("Name is: $field")
            return field
        }
}