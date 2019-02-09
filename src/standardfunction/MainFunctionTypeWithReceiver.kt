package standardfunction


val addName: Person.(job: String) -> String = { job ->
    this.name + " is " + job
}

fun main(args: Array<String>) {
    print(addName(Person(name = "Anh Viet Pham"),"Android Developer"))
}