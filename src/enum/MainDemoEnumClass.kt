package enum

fun main() {
    val msg = when(State.IDLE){
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(msg)

    val color = Color.BLUE

    val msgError = when(color){
        Color.RED -> "This is Red Color"
        Color.GREEN -> "This is Green Color"
        Color.BLUE -> "This is Blue Color"
        Color.YELLOW -> "This is Yellow Color"
    }

    println(Color.GREEN.name)

    println(msgError)

    println(color)
    println(color.rgb)
    println(color.containRed())
    println(Color.BLUE.containRed())
    println(Color.GREEN.containRed())

    val price = when(val motorbike = HondaStore.WAVE){
        HondaStore.WAVE -> "Wave's price is ${motorbike.price}"
        HondaStore.BLADE -> "Blade's price is ${motorbike.price}"
        HondaStore.CUP_C125 -> "Cup_C125's price is ${motorbike.price}"
        HondaStore.HONDA_SH -> "Honda_SH's price is ${motorbike.price}"
        HondaStore.AIR_BLADE -> "Air_Blade's price is ${motorbike.price}"
        HondaStore.PCX -> "PCX's price is ${motorbike.price}"
    }

    println(price)
}