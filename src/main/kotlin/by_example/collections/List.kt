package by_example.collections

// List
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1
val sudoers: MutableList<Int> = systemUsers                              // 2

fun addSystemUser(newUser: Int) {                                 // 3
    systemUsers.add(newUser)
}

fun getSysSudoers(): MutableList<Int> {                                  // 4
    return sudoers
}

/*fun main() {
    addSystemUser(4)                                              // 5
    println("Tot sudoers: ${getSysSudoers().size}")               // 6
    getSysSudoers().forEach {                                     // 7
            i -> println("Some useful info on user $i")
    }
//     getSysSudoers().add(5) <- Error!                           // 8
}*/

fun main() {
    val fruitList = ArrayList<String>()
    fruitList.add("Orange")
    fruitList.add("Apple")
    fruitList.add("Grapes")
    fruitList.add("Banana")

    println("Printing ArrayList elements --")
    println(fruitList)

    var retainList = ArrayList<String>()
    retainList.add("Apple")
    retainList.add("Grapes")
    println("Printing ArrayList of elements that will be retained --")
    println(retainList)

    fruitList.retainAll(retainList)

    println("Printing ArrayList elements after calling retainAll() --")
    println(fruitList)
}