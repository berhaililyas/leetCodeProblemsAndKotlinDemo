package concepts.basic_types.numbers

/**
 * When you initialize a variable with no explicit type specification,
 * the compiler automatically infers the type with the smallest range enough
 * to represent the value starting from Int.
 * If it is not exceeding the range of Int, the type is Int.
 * If it exceeds, the type is Long.
 */
val one = 1 // Int
val threeBillion = 3000000000 // Long

/**
 * To specify the Long value explicitly, append the suffix L to the value.
 */
val oneLong = 1L // Long

/**
 * Explicit type specification triggers the compiler to check the value not to exceed the range of the specified type.
 */
val oneByte: Byte = 1