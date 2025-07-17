/**
 * A detecting device compares the size of components produced by a machine
 * against the reference component. If the size of the component is larger,
 * it can be fixed; the detector prints 1. If the size of the component is
 * smaller, it is deemed as a rejection; the detector prints -1. If the
 * component is perfect, it is sent to the box; the detector prints 0. Write
 * a program which takes n (the number of parts) as input and then the detector
 * sequence. The program should output three numbers in a single line — the
 * number of perfect components, the number of larger components, and the
 * number of rejections.
 */
fun main() {
    val sequence: Int = readln().toInt()
    var perfect: Int = 0
    var smaller: Int = 0
    var larger: Int = 0

    repeat(sequence) {
        val userInput = readln().toInt()
        if (userInput == 0) {
            perfect++
        } else if (userInput == 1) {
            larger++
        } else if (userInput == -1) {
            smaller++
        }
    }
    println("${perfect} ${larger} ${smaller}")
}
