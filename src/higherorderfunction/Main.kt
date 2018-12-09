package higherorderfunction

private val PROMOTION_OFFSET = 100
private fun isPromotableEmployee(evaluate: () -> Int): Boolean {
    return evaluate() > PROMOTION_OFFSET
}

fun main(args: Array<String>) {
    val employee = EmployeeModel(name = "Anh Viet Pham")
    val hr = EvaluatorModel(name = "Le Thi Hoa")
    val manager = EvaluatorModel(name = "Pham Van Cuong")

    if (isPromotableEmployee { hr.scoreEmployee(employeeModel = employee) } && isPromotableEmployee { manager.scoreEmployee(employeeModel = employee) }) {
        println("$employee, congratulations! You been promoted")
    } else {
        println("$employee, we belive that the best version of you is about to take us by surprise. Keep going")
    }


    val biggest = fun(a: String, b: String): String {
        return when {
            a.length > b.length -> a
            else -> b
        }
    }


    val concat = fun(a: String, b: String) = a + b
    fun stringOperation(arr: List<String>, operation: (String, String) -> String) {
        var result = ""
        arr.forEach {
            result = operation(result, it)
        }
        println(result)
    }
    stringOperation(listOf("111", "22", "3"), biggest)
    stringOperation(listOf("111", "22", "3"), concat)
}