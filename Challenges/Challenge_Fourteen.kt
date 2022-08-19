/********************************************************************************************************************************************************************
* Write a program that prints a part of the following sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number of repetitions is equal to the respective number). Input is a positive integer n – the number of the elements of the sequence that the program should print. Output the sequence of numbers, written in a single line, separated by spaces.
*
* For example, if n is 7, the program should output 1 2 2 3 3 3 4 (seven numbers).
*****************************************************************************************************************************************************************/

// SOLUTION
fun main() {
    val n = readln().toInt() 
    var numCurrent = 0
    var numPrinted = 1
    while (numPrinted <= n) {
        repeat(numCurrent) {
            if (numPrinted <= n) {
                print("$numCurrent ")
                numPrinted++
            }
        }
        numCurrent++
    }
}
