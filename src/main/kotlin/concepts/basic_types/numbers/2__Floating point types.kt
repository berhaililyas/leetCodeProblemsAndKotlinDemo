package concepts.basic_types.numbers

/**
 * You can initialize Double and Float variables with numbers having a fractional part.
 * It's separated from the integer part by a period (.)
 * For variables initialized with fractional numbers, the compiler infers the Double type
 */
val pi = 3.14 // Double
// val one: Double = 1 // Error: type mismatch
val oneDouble = 1.0 // Double

/**
 * To explicitly specify the Float type for a value, add the suffix f or F.
 * If such a value contains more than 6-7 decimal digits, it will be rounded:
 */
val e = 2.7182818284 // Double
val eFloat = 2.7182818284f // Float, actual value is 2.7182817

fun main() {
//    fun printDouble(d: Double) { print(d) }

    val i = 1
    val d = 1.0
    val f = 1.0f

//    printDouble(d)
//    printDouble(i) // Error: Type mismatch
//    printDouble(f) // Error: Type mismatch
}
