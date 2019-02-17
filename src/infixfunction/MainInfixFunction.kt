package infixfunction

fun main(args: Array<String>){
    val war1 = War(200,10)
    val war2 = War(300,20)

    war1 attack war2
    print("War 2 have hp : ${war2.hp}")

}