package by_example.collections

// first and last
/*fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()
    val last = numbers.last()
    val firstEven = numbers.first { it % 2 == 0 }
    val lastEven = numbers.last { it % 2 == 0 }
    val firstOdd = numbers.first { it % 2 != 0 }
    val lastOdd = numbers.last { it % 2 != 0 }

    println("Numbers: $numbers")
    println("First $first, last $last")
    println("First even $firstEven, last even $lastEven")
    println("First odd $firstOdd, last odd $lastOdd")
}*/

// firstOrNull and lastOrNull
fun main() {
    val words = listOf("foo", "bar", "baz", "faz")         // 1
    val empty = emptyList<String>()                        // 2

    val firstW = words.firstOrNull()                        // 3
    val lastW = words.lastOrNull()
    val firstE = empty.firstOrNull()                        // 3
    val lastE = empty.lastOrNull()                          // 4

    val firstF = words.firstOrNull { it.startsWith('f') }  // 5
    val firstZ = words.firstOrNull { it.startsWith('z') }  // 6
    val lastF = words.lastOrNull { it.endsWith('f') }      // 7
    val lastZ = words.lastOrNull { it.endsWith('z') }

    println("Word list: first is $firstW, last is $lastW")
    println("Empty list: first is $firstE, last is $lastE")
    println("Word list: first item starting with 'f' is $firstF, first item starting with 'z' is $firstZ")
    println("Word list: last item ending with 'f' is $lastF, last item ending with 'z' is $lastZ")
}