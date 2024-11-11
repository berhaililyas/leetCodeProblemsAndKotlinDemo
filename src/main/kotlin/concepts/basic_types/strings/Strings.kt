package concepts.basic_types.booleans

fun main() {

    /**
     * Strings in Kotlin are represented by the type String.
     *
     * On the JVM, an object of String type in UTF-16 encoding uses approximately 2 bytes per character.
     *
     *
     *
     *
     */
    // Generally, a string value is a sequence of characters in double quotes ("):
    val str = "abcd"

    // Elements of a string are characters that you can access via the indexing operation: s[i].
    // You can iterate over these characters with a for loop:
    for (c in str) {
        println(c)
    }

    // Strings are immutable. Once you initialize a string, you can't change its value or assign a new value to it.
    // All operations that transform strings return their results in a new String object, leaving the original string unchanged

    // Creates and prints a new String object
    println(str.uppercase()) // ABCD

    // The original string remains the same
    println(str) // abcd

    // To concatenate strings, use the + operator.
    // This also works for concatenating strings with values of other types,
    // as long as the first element in the expression is a string:
//    val s = "abc" + 1
//    println(s + "def")
    // abc1def
    // In most cases using string templates or multiline strings is preferable to string concatenation.

    /**
     * String literals
     *
     * Kotlin has two types of string literals:
     *   - Escaped strings
     *   - Multiline strings
     */

    // Escaped strings : can contain escaped characters.
    // Here's an example of an escaped string:
    val s = "Hello, world!\n"
    // Escaping is done in the conventional way, with a backslash (\).

    // Multiline strings :  can contain newlines and arbitrary text.
    // It is delimited by a triple quote ("""), contains no escaping and can contain newlines and any other characters:
    val text1 = """
        for (c in "foo")
            print(c)
    """
    println(text1)

    // To remove leading whitespace from multiline strings, use the trimMargin() function:
    val text2 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text2)
    // By default, a pipe symbol | is used as margin prefix,
    // but you can choose another character and pass it as a parameter, like trimMargin(">").

    /**
     * String templates
     *   String literals may contain template expressions – pieces of code that are evaluated and whose results are concatenated into a string.
     *   When a template expression is processed, Kotlin automatically calls the .toString() function on the expression's result to convert it into a string.
     *   A template expression starts with a dollar sign ($) and consists of either a variable name
     */
    val i = 10
    println("i = $i") // i = 10

    val letters = listOf("a","b","c","d","e")
    println("Letters: $letters") // Letters: [a, b, c, d, e]

    val s1 = "abc"
    println("$s1.length is ${s1.length}") // abc.length is 3

    // You can use templates both in multiline and escaped strings.
    // To insert the dollar sign $ in a multiline string (which doesn't support backslash escaping) before any symbol,
    // which is allowed as a beginning of an identifier, use the following syntax:
    val price = """
         ${'$'}_9.99
        """

    /**
     * String formatting : String formatting with the String.format() function is only available in Kotlin/JVM.
     *
     * To format a string to your specific requirements, use the String.format() function.
     * The String.format() function accepts a format string and one or more arguments.
     * The format string contains one placeholder (indicated by %) for a given argument, followed by format specifiers.
     * Format specifiers are formatting instructions for the respective argument, consisting of flags, width, precision, and conversion type.
     * Collectively, format specifiers shape the output's formatting.
     * Common format specifiers include %d for integers, %f for floating-point numbers, and %s for strings.
     * You can also use the argument_index$ syntax to reference the same argument multiple times within the format string in different formats.
     * For a detailed understanding and an extensive list of format specifiers, see Java's Class Formatter documentation.
     *
     * Let's look at an example:
     */
    // Formats an integer, adding leading zeroes to reach a length of seven characters
    val integerNumber = String.format("%07d", 31416)
    println(integerNumber) // 0031416

    // Formats a floating-point number to display with a + sign and four decimal places
    val floatNumber = String.format("%+.4f", 3.141592)
    println(floatNumber) // +3.1416

    // Formats two strings to uppercase, each taking one placeholder
    val helloString = String.format("%S %S", "hello", "world")
    println(helloString) // HELLO WORLD

    // Formats a negative number to be enclosed in parentheses,
    // then repeats the same number in a different format (without parentheses) using `argument_index$`.
    val negativeNumberInParentheses = String.format("%(d means %1\$d", -31416)
    println(negativeNumberInParentheses) //(31416) means -31416

    /**
     * The String.format() function provides similar functionality to string templates.
     * However, the String.format() function is more versatile because there are more formatting options available.
     *
     * In addition, you can assign the format string from a variable.
     * This can be useful when the format string changes, for example, in localization cases that depend on the user locale.
     *
     * Be careful when using the String.format() function because it can be easy to mismatch the number or position
     * of the arguments with their corresponding placeholders.
     */













}