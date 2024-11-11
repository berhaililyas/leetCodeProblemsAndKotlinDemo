package concepts

fun main() {

    /**
     * Type checks and casts
     *
     * In Kotlin, you can perform type checks to check the type of an object at runtime.
     * Type casts enable you to convert objects to a different type.
     *
     * To learn specifically about generics type checks and casts, for example List<T>, Map<K,V>, see Generics type checks and casts.
     */

    /**
     * is and !is operators
     *
     * To perform a runtime check that identifies whether an object conforms to a given type,
     * use the is operator or its negated form !is
     */
    val obj = "string"
    if (obj is String) {
        print(obj.length)
    }

    if (obj !is String) { // Same as !(obj is String)
        print("Not a String")
    } else {
        print(obj.length)
    }

    /**
     * Smart casts
     *
     * In most cases, you don't need to use explicit cast operators because the compiler automatically casts objects for you.
     * This is called smart-casting.
     * The compiler tracks the type checks and explicit casts for immutable values and inserts implicit (safe) casts automatically when necessary:
     */
    fun demo(x: Any) {
        if (x is String) {
            print(x.length) // x is automatically cast to String
        }
    }
    // The compiler is even smart enough to know that a cast is safe if a negative check leads to a return:
    // if (x !is String) return
    // print(x.length) // x is automatically cast to String

    /**
     * Control flow
     *
     * Smart casts work not only for if conditional expressions but also for when expressions and while loops:
     */
//    when (x) {
//        is Int -> print(x + 1)
//        is String -> print(x.length + 1)
//        is IntArray -> print(x.sum())
//    }

    /**
     * Logical operators
     *
     * The compiler can perform smart casts on the right-hand side of && or || operators if there is a type check (regular or negative) on the left-hand side:
     */
    // x is automatically cast to String on the right-hand side of `||`
//    if (x !is String || x.length == 0) return

    // x is automatically cast to String on the right-hand side of `&&`
    /*if (x is String && x.length > 0) {
        print(x.length) // x is automatically cast to String
    }*/

    // If you combine type checks for objects with an or operator (||), a smart cast is made to their closest common supertype:
    /*interface Status {
        fun signal() {}
    }

    interface Ok : Status
    interface Postponed : Status
    interface Declined : Status

    fun signalCheck(signalStatus: Any) {
        if (signalStatus is Postponed || signalStatus is Declined) {
            // signalStatus is smart-cast to a common supertype Status
            signalStatus.signal()
        }
    }*/

    /**
     * "Unsafe" cast operator
     *
     * To explicitly cast an object to a non-nullable type, use the unsafe cast operator as:
     *     val x: String = y as String
     * If the cast isn't possible, the compiler throws an exception. This is why it's called unsafe.
     */

    /**
     * "Safe" (nullable) cast operator
     *
     *  To avoid exceptions, use the safe cast operator as?, which returns null on failure.
     *  val x: String? = y as? String
     *
     *  Note that despite the fact that the right-hand side of as? is a non-nullable type String,
     *  the result of the cast is nullable.
     */


}