/**
 * Try to read a line. If there is no line, throw an IllegalStateException().
 * If there is a line, output Elvis says: $line.
 * Use the ?: throw construction to solve this task.
 */
fun main() {
    val line = readLine()?.takeUnless { it.isBlank() } ?: throw IllegalStateException()
    println("Elvis says: $line")
}
