package concepts.basic_types.numbers

/**
 * On the JVM platform, numbers are stored as primitive types: int, double, and so on.
 * Exceptions are cases when you create a nullable number reference such as Int? or use generics.
 * In these cases numbers are boxed in Java classes Integer, Double, and so on.
 *
 * All nullable references to a are actually the same object because of the memory optimization that JVM applies to Integers between -128 and 127.
 * It doesn't apply to the b references, so they are different objects.
 */
fun main() {
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
//    println(boxedA === anotherBoxedA) // true

    val b: Int = 10000
//    println(b == b) // true

    val boxedB: Int? = b
    val anotherBoxedB: Int? = b
//    println(boxedB == anotherBoxedB) // true
//    println(boxedB === anotherBoxedB) // false
}