/**
 * Write an implementation of a function named isNumber that determines if
 * String can be converted to Int . If it can, then return its Int value,
 * otherwise return the same String. Note that the return type of this
 * function is Any, as it can return either an Int or a String.
 */
fun isNumber(input: String) : Any = input.toIntOrNull() ?: input

fun main() {
    val userInput = readln()

    println(isNumber(userInput))
}
