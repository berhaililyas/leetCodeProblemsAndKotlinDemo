//    =========== Lambda expressions =====================
//
//    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
//    val mul = { x: Int, y: Int -> x * y }
//
//    According to Kotlin convention, if the last parameter of a function is a function,
//    then a lambda expression passed as the corresponding argument can be placed outside the parentheses:
//
//    val badProduct = items.fold(1, { acc, e -> acc * e })
//
//    val goodProduct = items.fold(1) { acc, e -> acc * e }
//
//    If the lambda is the only argument, the parentheses can be omitted entirely
//    (the documentation calls this feature "trailing lambda as a parameter"):
//
//    run({ println("Not Cool") })
//    run { println("Very Cool") }

