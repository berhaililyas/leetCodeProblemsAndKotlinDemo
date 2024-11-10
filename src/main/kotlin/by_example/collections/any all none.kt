package by_example.collections

// Function any
/*fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val anyNegative = numbers.any { it < 0 }             // 2

    val anyGT6 = numbers.any { it > 6 }                  // 3

    println("Numbers: $numbers")
    println("Is there any number less than 0: $anyNegative")
    println("Is there any number greater than 6: $anyGT6")
}*/

// Function all
/*fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val allEven = numbers.all { it % 2 == 0 }

    val allLess6 = numbers.all { it < 6 }

    println("Numbers: $numbers")
    println("All numbers are even: $allEven")
    println("All numbers are less than 6: $allLess6")
}*/

// Function none
fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val noneEven = numbers.none { it % 2 == 0 }

    val noneGT6 = numbers.none { it > 6 }

    println("Numbers: $numbers")
    println("No element is even: $noneEven")
    println("No element is greater than 6: $noneGT6")
}