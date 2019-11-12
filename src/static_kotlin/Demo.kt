package static_kotlin

object Demo {
    fun isNullOrEmpty(str: String?): Boolean {
        return null == str || str.isEmpty()
    }
}