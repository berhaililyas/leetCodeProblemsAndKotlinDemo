fun main() {
    println("======Loops========")

    val items = listOf("apple", "banana", "kiwifruit")

    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    for ((index, item) in items.withIndex()) {
        println("item at $index is $item")
    }

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

//    var toComplete: Boolean
//    do {
//        ...
//        toComplete = ...
//    } while(toComplete)

//    The condition variable can be initialized inside to the do…while loop.

//    There are break and continue labels for loops:
//
//    myLabel@ for (item in items) {
//        for (anotherItem in otherItems) {
//            if (...) break@myLabel
//            else continue@myLabel
//        }
//    }

}
