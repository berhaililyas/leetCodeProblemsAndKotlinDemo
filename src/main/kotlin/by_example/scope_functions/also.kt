package by_example.scope_functions

// also
data class AnotherPerson(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: AnotherPerson) {
    println("A new person ${p.name} was created.")
}

fun main() {
    val jake = AnotherPerson("Jake", 30, "Android developer")   // 1
        .also {                                          // 2
            writeCreationLog(it)                         // 3
        }
    println(jake)
}