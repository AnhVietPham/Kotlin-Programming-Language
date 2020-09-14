package scopefunctions

class Person(var name: String = "Anh Viet Pham",
             var age: Int = 19,
             var contactNumber: String = "1234567890",
             var address: String = "Tan Thanh Bac Tan Uyen Binh Duong") {

    fun displayInfo() = print("\n Name: $name\n " + " age: $age" +
            "Contact Number: $contactNumber\n " +
            "Address: $address")

    fun moveTo(address: String) {
        this.address = address
    }

    fun incrementAge() {
        this.age++
    }

    fun changeContactNumber(contactNumber: String) {
        this.contactNumber = contactNumber
    }


    override fun toString(): String {
        return "Person(name=$name, age=$age, city=$address, contactNumber = $contactNumber)"
    }
}