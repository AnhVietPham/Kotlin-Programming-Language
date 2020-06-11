package enum

enum class Color(val rgb: Int) {
    RED(10),
    GREEN(9),
    BLUE(8),
    YELLOW(7);

    fun containRed() = (this.rgb == 10)
}