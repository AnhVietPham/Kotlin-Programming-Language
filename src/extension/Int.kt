package extension

fun Int?.valueOrDefault(default: Int): Int {
    return this ?: default
}

fun Int?.valueOrEmpty(): Int {
    return this.valueOrDefault(0)
}