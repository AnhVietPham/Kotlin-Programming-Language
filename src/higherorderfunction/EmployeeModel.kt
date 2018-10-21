package higherorderfunction

class EmployeeModel(val name: String) {
    fun scoreEmployee(evaluatorModel: EvaluatorModel): Int {
        return if (evaluatorModel.name == "Le Thi Hoa" || evaluatorModel.name == "Pham Van Cuong") {
            100
        } else {
            300
        }
    }
}