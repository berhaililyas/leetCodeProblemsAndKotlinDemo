fun main() {
    println("======Ranges========")

    val x = 10
    if (x in 1..10) {
        println("fits in range")
    }

    for (x in 1..5) {
        print(x)
    }

    for (x in 9 downTo 0 step 3) {
        print(x)
    }

//    downTo and step are extension functions, not keywords.
//    '..' is actually T.rangeTo(that: T)

}
