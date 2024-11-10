package concepts.basic_types.arrays

fun main() {

    /**
     * Arrays
     *
     * An array is a data structure that holds a fixed number of values of the same type or its subtypes.
     * The most common type of array in Kotlin is the object-type array, represented by the 'Array' class.
     *
     * If you use primitives in an object-type array, this has a performance impact because your primitives are boxed into objects.
     * To avoid boxing overhead, use primitive-type arrays instead.
     * For example :
     *   - 'BooleanArray' that equivalent in Java to 'boolean[]'
     *   - 'DoubleArray' that equivalent in Java to 'double[]'
     */

    /**
     * When to use arrays
     *
     * Use arrays in Kotlin when you have specialized low-level requirements that you need to meet.
     * For example, if you have performance requirements beyond what is needed for regular applications,
     * or you need to build custom data structures.
     * If you don't have these sorts of restrictions, use collections instead.
     *
     * Collections have the following benefits compared to arrays:
     *   - Collections can be read-only, which gives you more control and allows you to write robust code that has a clear intent.
     *   - It is easy to add or remove elements from collections. In comparison, arrays are fixed in size.
     *   The only way to add or remove elements from an array is to create a new array each time,
     *   which is very inefficient:
     *      var riversArray = arrayOf("Nile", "Amazon", "Yangtze")
     *
     *      // Using the += assignment operation creates a new riversArray,
     *      // copies over the original elements and adds "Mississippi"
     *       riversArray += "Mississippi"
     *       println(riversArray.joinToString())
     *       // Nile, Amazon, Yangtze, Mississippi
     *
     *  You can use the equality operator (==) to check if collections are structurally equal.
     *  You can't use this operator for arrays.
     *  Instead, you have to use a special function, which you can read more about in Compare arrays.
     */

    /**
     * Create arrays
     *
     * To create arrays in Kotlin, you can use:
     *   - functions, such as arrayOf(), arrayOfNulls() or emptyArray().
     *   - the Array constructor.
     *
     * This example uses the arrayOf() function and passes item values to it:
     */
    // Creates an array with values [1, 2, 3]
//    val simpleArray = arrayOf(1, 2, 3)
//    println(simpleArray.joinToString()) // 1, 2, 3

    // Creates an array with values [null, null, null]
    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString()) // null, null, null

    // Create an emptyArray
    var emptyArray = emptyArray<String>()

    // You can specify the type of the empty array on the left-hand or right-hand side of the assignment due to Kotlin's type inference.
    // For example:
    var emptyArrayWithTypeOnLeftHand = emptyArray<String>()
    var emptyArrayWithTypeOnRightHand: Array<String> = emptyArray()

    // The Array constructor takes the array size and a function that returns values for array elements given its index:
    // Creates an Array<Int> that initializes with zeros [0, 0, 0]
    val initArray = Array<Int>(3) { 0 }
    println(initArray.joinToString()) // 0, 0, 0

    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { print(it) } // 014916
    // Like in most programming languages, indices start from 0 in Kotlin.

    /**
     * Nested arrays
     *
     * Arrays can be nested within each other to create multidimensional arrays
     */
    // Creates a two-dimensional array
//    val twoDArray = Array(2) { Array<Int>(3) { 0 } }
//    println(twoDArray.contentDeepToString()) // [[0, 0, 0], [0, 0, 0]]

    // Creates a three-dimensional array
    // Nested arrays don't have to be the same type or the same size.
//    val threeDArray = Array(3) { Array(2) { Array<String>(3) { it.toString() } } }
//    println(threeDArray.contentDeepToString())
    // [[[0, 1, 2], [0, 1, 2]], [[0, 1, 2], [0, 1, 2]], [[0, 1, 2], [0, 1, 2]]]

    /**
     * Access and modify elements
     *
     * Arrays are always mutable. To access and modify elements in an array, use the indexed access operator[]:
     *
     * Arrays in Kotlin are invariant.
     * This means that Kotlin doesn't allow you to assign an Array<String> to an Array<Any> to prevent a possible runtime failure.
     * Instead, you can use Array<out Any>. For more information, see Type Projections.
     */
//    val simpleArray = arrayOf(1, 2, 3)
//    val twoDArray = Array(2) { Array<Int>(2) { 0 } }

    // Accesses the element and modifies it
//    simpleArray[0] = 10
//    twoDArray[0][0] = 2

    // Prints the modified element
//    println(simpleArray[0].toString()) // 10
//    println(twoDArray[0][0].toString()) // 2

    /**
     * Work with arrays
     *
     * In Kotlin, you can work with arrays by using them to pass a variable number of arguments to a function
     * or perform operations on the arrays themselves.
     * For example, comparing arrays, transforming their contents or converting them to collections.
     */

    /**
     * Pass variable number of arguments to a function
     *
     * In Kotlin, you can pass a variable number of arguments to a function via the 'vararg' parameter.
     * This is useful when you don't know the number of arguments in advance, like when formatting a message or creating an SQL query.
     *
     * To pass an array containing a variable number of arguments to a function, use the spread operator (*).
     * The spread operator passes each element of the array as individual arguments to your chosen function:
     */
    fun printAllStrings(vararg strings: String) {
        for (string in strings) {
            print(string)
        }
    }

    val lettersArray = arrayOf("c", "d")
    printAllStrings("a", "b", *lettersArray) // abcd

    /**
     * Compare arrays
     *
     * To compare whether two arrays have the same elements in the same order,
     * use the .contentEquals() and .contentDeepEquals() functions:
     *
     * Don't use equality (==) and inequality (!=) operators to compare the contents of arrays.
     * These operators check whether the assigned variables point to the same object.
     */
    val simpleArray = arrayOf(1, 2, 3)
    val anotherArray = arrayOf(1, 2, 3)

    // Compares contents of arrays
    println(simpleArray.contentEquals(anotherArray)) // true

    // Using infix notation, compares contents of arrays after an element is changed
    simpleArray[0] = 10
    println(simpleArray contentEquals anotherArray) // false

    /**
     * Transform arrays
     *
     * Kotlin has many useful functions to transform arrays.
     * This document highlights a few but this isn't an exhaustive list.
     * For the full list of functions, see our API reference.
     */
    val array = arrayOf(1, 2, 3)

    // Sum : To return the sum of all elements in an array, use the .sum() function
    // The .sum() function can only be used with arrays of numeric data types, such as Int.
    println(array.sum()) // 6

    // Shuffle : To randomly shuffle the elements in an array, use the .shuffle() function:
    // Shuffles elements [3, 2, 1]
    array.shuffle()
    println(array.joinToString())

    // Shuffles elements again [2, 3, 1]
    array.shuffle()
    println(array.joinToString())

    /**
     * Convert arrays to collections
     *
     * If you work with different APIs where some use arrays and some use collections, then you can convert your arrays to collections and vice versa.
     *   - Convert to List or Set
     *   To convert an array to a List or Set, use the .toList() and .toSet() functions.
     *   - Convert to Map
     *   To convert an array to a Map, use the .toMap() function
     *   Only an array of Pair<K,V> can be converted to a Map.
     *   The first value of a Pair instance becomes a key, and the second becomes a value.
     *
     */
    val strings = arrayOf("a", "b", "c", "c")

    // Converts to a Set
    println(strings.toSet()) // [a, b, c]

    // Converts to a List
    println(strings.toList()) // [a, b, c, c]

    // This example uses the infix notation to call the to function to create tuples of Pair
    val pairArray = arrayOf("apple" to 120, "banana" to 150, "cherry" to 90, "apple" to 140)

    // Converts to a Map
    // The keys are fruits and the values are their number of calories
    // Note how keys must be unique, so the latest value of "apple" overwrites the first
    println(pairArray.toMap()) // {apple=140, banana=150, cherry=90}

    /**
     * Primitive-type arrays
     *
     * If you use the Array class with primitive values, these values are boxed into objects.
     * As an alternative, you can use primitive-type arrays, which allow you to store primitives in an array without the side effect of boxing overhead:
     * Examples of Primitive-type array :
     *   - 'BooleanArray' equivalent in Java 'boolean[]'
     *   - 'ByteArray' equivalent in Java 'byte[]'
     *   - 'CharArray' equivalent in Java 'char[]'
     *   - 'DoubleArray' equivalent in Java 'double[]'
     *   - 'FloatArray' equivalent in Java 'float[]'
     *   - 'IntArray' equivalent in Java 'int[]'
     *   - 'LongArray' equivalent in Java 'long[]'
     *   - 'ShortArray' equivalent in Java 'short[]'
     *
     *  These classes have no inheritance relation to the Array class, but they have the same set of functions and properties.
     *
     *  To convert primitive-type arrays to object-type arrays, use the .toTypedArray() function.
     *  To convert object-type arrays to primitive-type arrays, use .toBooleanArray(), .toByteArray(), .toCharArray(), and so on.
     */
    // This example creates an instance of the IntArray class:
    // Creates an array of Int of size 5 with the values initialized to zero
    val exampleArray = IntArray(5)
    println(exampleArray.joinToString()) // 0, 0, 0, 0, 0
}