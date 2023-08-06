fun main(args: Array<String>) {
    println("======Variables========")
    println("Hello World!")

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