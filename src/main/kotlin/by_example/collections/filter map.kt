package by_example.collections

// filter and map
fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1

    val positives = numbers.filter { x -> x > 0 }  // 2

    val negatives = numbers.filter { it < 0 }      // 3

    val doubled = numbers.map { x -> x * 2 }      // 4

    val tripled = numbers.map { it * 3 }          // 5

    println("Numbers: $numbers")
    println("Positive Numbers: $positives")
    println("Negative Numbers: $negatives")
    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")
}