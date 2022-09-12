/****************************************************************************************************
* QUESTION
* The program gets a sequence of non-negative integers as input. Each integer is written on a separate line.
* The sequence contains an integer 0. After reading 0, the program should terminate and output the length of
* the sequence (do not count the final 0)
***********************************************************************************************************/

// SOLUTION
fun main() {
    var count = 0
    do {
        val input = readln().toInt()
        count++
    } while (input != 0)
    println(count - 1)
}
