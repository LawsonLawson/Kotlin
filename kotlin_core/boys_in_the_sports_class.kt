/**
 * Imagine there are three boys in a sports class.

You need to write a program that checks if the boys are arranged in ascending or descending order by height. The program should read three integer numbers h1, h2, h3 and output true or false. If the boys have the same height, they are arranged correctly.

Sample Input 1:

165
161
158

Sample Output 1:

true

Sample Input 2:

155
165
160

Sample Output 2:

false

Sample Input 3:

161
161
165

Sample Output 3:

true
*/

import java.util.Scanner

fun main() {
    val heightReader = Scanner(System.`in`)

    val h1 = heightReader.nextInt()
    val h2 = heightReader.nextInt()
    val h3 = heightReader.nextInt()

    var status: Boolean = false
    val ascending = h1 <= h2 && h2 <= h3
    val descending = h1 >= h2 && h2 >= h3

    if ( ascending || descending ) {
        status = true
    }

    println("$status")
}
