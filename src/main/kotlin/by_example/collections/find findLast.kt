package by_example.collections

// find findLast
fun main() {
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1

    val first = words.find { it.startsWith("some") }
    val last = words.findLast { it.startsWith("some") }
    val nothing = words.find { it.contains("nothing") }

    println("Words are: $words")
    println("The first element starting with 'some' is: $first")
    println("The last element starting with 'some' is: $last")
    println("The first element containing 'nothing' is: $nothing")
}