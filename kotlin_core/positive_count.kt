fun isPositive(input: Int) : Boolean = (input > 0)

fun main() {
    val userInput: Int = readln().toInt()
    var positiveInputs: Int = 0

    repeat(userInput) {
        var individualInput: Int = readln().toInt()
        if (isPositive(individualInput)) {
            positiveInputs++
        }
    }
    println(positiveInputs)
}
