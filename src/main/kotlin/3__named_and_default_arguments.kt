fun main() {
    println("======Functions: default values========")
    displaySeparator('#', 5)
    displaySeparator('#')
    displaySeparator()
//    displaySeparator(3, '5') => Kotlin: The integer literal does not conform to the expected type Char
    displaySeparator(size = 3, character = '5')
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}