/**************************************************************************************************************************************
* Read an Int number. Write a program that prints false if this number is between 1 and 10 (inclusive), and true otherwise.
**************************************************************************************************************************************/

// SOLUTION
const val ONE = 1
const val TEN = 10

fun main() {
    val number = readln().toInt()
    if (number in ONE..TEN) {
        println(false)
    } else {
        println(true)
    }

}
