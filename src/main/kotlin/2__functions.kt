//    Single expression function.
//    Unit means that the function does not return anything meaningful.
//    It can be omitted.
//    Arguments can have default values.
//
//    fun sum(a: Int, b: Int): Int {
//        return a + b
//    }
//
//    fun mul(a: Int, b: Int) = a * b
//
//    fun printMul(a: Int, b: Int): Unit {
//        println(mul(a, b))
//    }
//
//    fun printMul1(a: Int = 1, b: Int) {
//        println(mul(a, b))
//    }
//
//    fun printMul2(a: Int, b: Int = 1) = println(mul(a, b))

fun main() {
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