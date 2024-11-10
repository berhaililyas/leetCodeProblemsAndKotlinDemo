package by_example.productivity_boosters

fun findMinMax(list: List<Int>): Pair<Int, Int> = Pair(list.min(), list.max())

/*fun main() {
    val (x, y, z) = arrayOf(5, 10, 15)                              // 1
    println("x=$x,y=$y,z=$z")

    val map = mapOf("Alice" to 21, "Bob" to 25)
    for ((name, age) in map) {                                      // 2
        println("$name is $age years old")
    }

    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))    // 3
    println("min: $min and max: $max")
}*/

data class User(val username: String, val email: String)    // 1

fun getUser() = User("Mary", "mary@somewhere.com")

/*
fun main() {
    val user = getUser()
    val (username, email) = user                            // 2
    println(username == user.component1())                  // 3
    println("email : $email")                  // 3

    val (_, emailAddress) = getUser()                       // 4
    println("emailAddress : $emailAddress")
}*/

class Pair<K, V>(val first: K, val second: V) {  // 1
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}

fun main() {
    val (num, name) = Pair(1, "one")             // 2

    println("num = $num, name = $name")
}