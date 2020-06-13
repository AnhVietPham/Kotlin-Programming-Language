package sealed

sealed class Operation(var a: Int, var b: Int)
class Add(numberOne: Int,numberTwo: Int) : Operation(numberOne, numberTwo)
class Subtract(numberOne: Int,numberTwo: Int) : Operation(numberOne, numberTwo)
class Multiply(numberOne: Int,numberTwo: Int) : Operation(numberOne, numberTwo)
class Divide(numberOne: Int,numberTwo: Int) : Operation(numberOne, numberTwo)

fun execute(op: Operation) = when (op) {
    is Add -> op.a + op.b
    is Subtract -> op.a - op.b
    is Multiply -> op.a * op.b
    is Divide -> op.a / op.b
}
