package higherorderfunction

class EvaluatorModel(val name: String) {
    fun scoreEmployee(employeeModel: EmployeeModel): Int {
        return if (employeeModel.name == "Le Thi Hoa" || employeeModel.name == "Pham Van Cuong") {
            100
        } else {
            300
        }
    }
}