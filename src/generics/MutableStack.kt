package generics

class MutableStack<V>(vararg items: V) {
    private val elements = items.toMutableList()

    fun push(element: V) = elements.add(element = element)

    fun peek(): V = elements.last()

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size
}

class Student(
        var fullName: String,
        var age: Int,
        val address: String
)

fun <T> mutableStackOf(vararg items: T) = MutableStack(*items)

fun main(args: Array<String>) {
    val students = arrayOf(
            Student(
                    "Huy Hoang Le Pham",
                    15,
                    "Bac Tan Uyen Binh Duong"
            ),
            Student(
                    "Huy Hoang Le Pham",
                    15,
                    "Bac Tan Uyen Binh Duong"
            ),
            Student(
                    "Huy Hoang Le Pham",
                    15,
                    "Bac Tan Uyen Binh Duong"
            ),
            Student(
                    "Huy Hoang Le Pham 100000",
                    15,
                    "Bac Tan Uyen Binh Duong"
            )
    )
    val mutableStack = MutableStack(
            1,
            2,
            3,
            4,
            Student(fullName = "Anh Viet Pham",
                    address = "Bac Tan Uyen Binh Duong",
                    age = 20),
            Student(fullName = "Anh Viet Pham",
                    address = "Bac Tan Uyen Binh Duong",
                    age = 20),
            Student(fullName = "Anh Viet Pham",
                    address = "Bac Tan Uyen Binh Duong",
                    age = 20),
            Student(fullName = "Anh Viet Pham",
                    address = "Bac Tan Uyen Binh Duong",
                    age = 20),
            *students
    )

    println(mutableStack.size())
    println((mutableStack.peek() as? Student)?.fullName)

    val myMutableStackOf = mutableStackOf("JAV", 1, 4, 5, "Anh Viet Pham JAV JAV JAV JAV JAV JAV JAV JAV")
    println(myMutableStackOf.size())
    println(myMutableStackOf.peek())
}