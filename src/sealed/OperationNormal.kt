package sealed

abstract class OperationNormal(var a: Int, var b: Int) {
    fun execute(op: OperationNormal) = when (op) {
        is OperationADD -> {
            op.a + op.b
        }
        is OperationSUB -> {
            op.a - op.b
        }
        is OperationDIV -> {
            op.a / op.b
        }
        is OperationMUL -> {
            op.a * op.b
        }
        else ->{
            0.0
        }
    }
}