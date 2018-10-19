package higherorderfunction

class EmployeeEvaluation {
    val PROMOTION_OFFSET = 100
    fun isPromotableEmployee(evaluate: () -> Int): Boolean {
        return evaluate() > PROMOTION_OFFSET
    }

    fun main(args: Array<String>) {
        val employee = EmployeeModel(name = "Anh Viet Pham")
        val hr = EvaluatorModel(name = "Le Thi Hoa")
        val manager = EvaluatorModel(name = "Pham Van Cuong")

        if (is)
    }
}