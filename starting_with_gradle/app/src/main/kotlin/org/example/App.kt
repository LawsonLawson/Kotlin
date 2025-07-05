/*
 * This is a simple kt file.
 */
package org.example

class App {
    val greeting: String
        get() {
            return "Hey there, I am new to Gradle!"
        }
}

fun main() {
    println(App().greeting)
}
