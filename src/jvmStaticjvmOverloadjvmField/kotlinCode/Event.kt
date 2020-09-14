package jvmStaticjvmOverloadjvmField.kotlinCode

import java.util.*

data class Event @JvmOverloads constructor(
        @JvmField val name: String,
        val date: Date = Date()
)