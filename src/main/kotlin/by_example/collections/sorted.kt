package by_example.collections

// sorted
import kotlin.math.abs
import kotlin.math.min

fun main() {
    val shuffled = listOf(5, 4, 2, 1, 3, -10)                   // 1
    val natural = shuffled.sorted()                             // 2
    val inverted = shuffled.sortedBy { -it }                    // 3
    val descending = shuffled.sortedDescending()                // 4
    val descendingBy = shuffled.sortedByDescending { abs(it)  } // 5
    val test = "ilyas".compareTo("ylisa", ignoreCase = true)                           // 2
    val testCopy = "iL".compareToInternalImplementation("i")                           // 2
    val testE = "I".equals("i", ignoreCase = true)                           // 2

    println("compareTo test: $test")
    println("compareToCopy test: $testCopy")
    println("equals test: $testE")
//    println("Shuffled: $shuffled")
//    println("Natural order: $natural")
//    println("Inverted natural order: $inverted")
//    println("Inverted natural order value: $descending")
//    println("Inverted natural order of absolute values: $descendingBy")
}

// Internal implementation
fun String.compareToInternalImplementation(anotherString: String): Int {
    val length1: Int = this.length
    val length2: Int = anotherString.length
    val limit = min(length1, length2)

    val v1: CharArray = this.toCharArray()
    val v2: CharArray = anotherString.toCharArray()

    var i = 0
    while (i < limit) {
        val ch1 = v1[i]
        val ch2 = v2[i]
        if (ch1 != ch2) {
            return ch1.code - ch2.code
        }
        i++
    }

    return length1 - length2
}