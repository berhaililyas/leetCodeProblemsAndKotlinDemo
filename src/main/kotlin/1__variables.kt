fun main(args: Array<String>) {
    println("======Variables========")
    println("Hello World!")

//    val/var myValue: Type = someValue
//    var - mutable
//    val - immutable
//    Type can be inferred in most cases
//    Assignment can be deferred
//
//    val a: Int = 1	// immediate assignment
//
//    var b = 2		// 'Int' type is inferred
//    b = a 			// Reassigning to 'var' is okay
//
//    val c: Int		// Type required when no initializer is provided
//    c = 3			// Deferred assignment
//    a = 4			// Error: Val cannot be reassigned
//
//    const val/val myValue: Type = someValue
//    const val - compile-time const value
//    val - immutable value
//    for const val use uppercase for naming
//
//    const val NAME = "Kotlin"	// can be calculated at compile-time
//    val nameLowered = NAME.lowercase()	 // cannot be calculated at compile-time

    // 'val' variable
    val greeting = "Hi"
    println("$greeting World!")

    // 'var' variable
    var speficPeople = "Algeria people"
    println("$greeting $speficPeople!")

    speficPeople = "France people"
    println("$greeting $speficPeople!")

    // 'readOnlyList' vs 'mutableListOf'
    val readOnlyList = listOf("Algeria")
    println("$readOnlyList")
    // can't do this on readOnlyList : readOnlyList.add("France")

    val mutableList = mutableListOf("Algeria")
    mutableList.add("France")
    println("$mutableList")
}