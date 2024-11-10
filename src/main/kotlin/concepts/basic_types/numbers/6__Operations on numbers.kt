package concepts.basic_types.numbers

fun main() {
    /**
     * Kotlin supports the standard set of arithmetical operations over numbers: +, -, *, /, %.
     * They are declared as members of appropriate classes:
     */
//    println(1 + 2)
//    println(2_500_000_000L - 1L)
//    println(3.14 * 2.71)
//    println(10.0 / 3)

    /**
     * Division of integers
     *      Division between integers numbers always returns an integer number. Any fractional part is discarded.
     */
//    val x = 5 / 2
    // println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
//    println(x == 2)

    // This is true for a division between any two integer types:
//    val x = 5L / 2
//    println(x == 2L)

    // To return a floating-point type, explicitly convert one of the arguments to a floating-point type:
//    val x = 5 / 2.toDouble()
//    println(x == 2.5)

    /**
     * Bitwise operations
     *     Kotlin provides a set of bitwise operations on integer numbers.
     *     They operate on the binary level directly with bits of the numbers' representation.
     *     Bitwise operations are represented by functions that can be called in infix form.
     *     They can be applied only to Int and Long.
     *
     * Here is the complete list of bitwise operations:
     *      shl(bits) – signed shift left
     *      shr(bits) – signed shift right
     *      ushr(bits) – unsigned shift right
     *      and(bits) – bitwise AND
     *      or(bits) – bitwise OR
     *      xor(bits) – bitwise XOR
     *      inv() – bitwise inversion
     */
//    val x = (1 shl 2) and 0x000FF000

    /**
     * Floating-point numbers comparison
     *
     *     The operations on floating-point numbers discussed in this section are:
     *      Equality checks: a == b and a != b
     *      Comparison operators: a < b, a > b, a <= b, a >= b
     *      Range instantiation and range checks: a..b, x in a..b, x !in a..b
     *
     *  When the operands a and b are statically known to be Float or Double or their nullable counterparts
     *  (the type is declared or inferred or is a result of a smart cast), the operations on the numbers and
     *  the range that they form follow the IEEE 754 Standard for Floating-Point Arithmetic.
     *
     *  However, to support generic use cases and provide total ordering, the behavior is different for operands
     *  that are not statically typed as floating-point numbers. For example, Any, Comparable<...>, or Collection<T> types.
     *  In this case, the operations use the equals and compareTo implementations for Float and Double.
     *  As a result:
     *      NaN is considered equal to itself
     *      NaN is considered greater than any other element including POSITIVE_INFINITY
     *      -0.0 is considered less than 0.0
     *
     *  Here is an example that shows the difference in behavior between operands statically typed as floating-point
     *  numbers (Double.NaN) and operands not statically typed as floating-point numbers (listOf(T)).
     */
    // Operand statically typed as floating-point number
    println(Double.NaN == Double.NaN)                 // false
    // Operand NOT statically typed as floating-point number
    // So NaN is equal to itself
    println(listOf(Double.NaN) == listOf(Double.NaN)) // true

    // Operand statically typed as floating-point number
    println(0.0 == -0.0)                              // true
    // Operand NOT statically typed as floating-point number
    // So -0.0 is less than 0.0
    println(listOf(0.0) == listOf(-0.0))              // false

    println(listOf(Double.NaN, Double.POSITIVE_INFINITY, 0.0, -0.0).sorted())
    // [-0.0, 0.0, Infinity, NaN]
}