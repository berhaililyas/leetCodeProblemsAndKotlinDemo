package concepts.basic_types.numbers

/**
 * There are the following kinds of literal constants for integral values:
 *
 * Decimals: 123
 *
 * Longs are tagged by a capital L: 123L
 *
 * Hexadecimals: 0x0F
 *
 * Binaries: 0b00001011
 *
 * Octal literals are not supported in Kotlin.
 */
val decimal = 123 // Decimals
val long = 123L  // Longs
val hexacedimal = 0x123F  // Hexadecimals
val binary = 0b1010  // Binaries

/**
 * Kotlin also supports a conventional notation for floating-point numbers:
 * Doubles by default: 123.5, 123.5e10
 *
 * Floats are tagged by f or F: 123.5f
 */
val double1 = 123.5
val double2 = 123.5e10

val float = 123.5f

/**
 * You can use underscores to make number constants more readable:
 */
val oneMillion = 1_000_000
val creditCardNumber = 1234_5678_9012_3456L
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010