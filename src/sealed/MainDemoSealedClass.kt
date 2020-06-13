package sealed

fun main() {
    val whiteCat = Cat("White Cat", 19)
    whiteCat.eat(20)
    whiteCat.sleep(11)
    whiteCat.play("Soccer")
    val exp1 = Const(10.0)
    val exp2 = Const(11.0)
    val const = Const(19.0)
    val sum = Sum(exp1, exp2)

    println(eval(const))
    println(eval(sum))

    val a = 10
    val b = 20

    val operationEnum = OperationEnum.ADD

    when (operationEnum) {
        OperationEnum.ADD -> {
            println(add(a, b))
        }
        OperationEnum.SUBTRACT -> {
            println(sub(a, b))
        }
        OperationEnum.MULTIPLY -> {
            println(mul(a, b))
        }
        OperationEnum.DIVIDE -> {
            println(divide(a, b))
        }
    }

    val add = Add(10, 20)
    val add2 = Add(22, 30)
    val sub = Subtract(15, 50)
    val mul = Multiply(30, 77)
    val divide = Divide(30, 15)
    println(execute(add))
}

fun add(a: Int, b: Int) = a + b
fun sub(a: Int, b: Int) = a - b
fun divide(a: Int, b: Int) = a / b
fun mul(a: Int, b: Int) = a * b