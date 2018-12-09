package dsl


fun person(block: (Person) -> Unit): Person {
    val p = Person()
    block(p)
    return p
}

fun person1(block: Person.() -> Unit): Person {
    val p = Person()
    p.block()
    return p
}

fun Person.address(block: Address.() -> Unit) {
    address = Address().apply(block)
}
