sealed class Mammal(val name: String)                                                   // 1

class Cat(val catName: String) : Mammal(catName)                                        // 2
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal) = when (mammal) {                                                                     // 3
    is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4
    is Cat -> "Hello ${mammal.name}"                                         // 5
    else -> {}
}

fun main() {
    println(greetMammal(Cat("Snowy")))
}