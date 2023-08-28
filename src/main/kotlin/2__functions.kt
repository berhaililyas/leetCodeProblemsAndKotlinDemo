fun main(args: Array<String>) {
    println("======Functions========")
    displayMax(5, 6)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
// => convert to expression body
fun maxConvertedToExpressionBody(a: Int, b: Int) = if (a > b) a else b

fun displayMax(a: Int, b: Int): Unit {
    println(max(a, b))
}

// Functions everywhere
// Top-level function
fun topLevel() = 1

// Member function
class A {
    fun member() = 2
}

// Local function
fun other() {
    fun local() = 3
}