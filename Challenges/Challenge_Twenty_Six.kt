/****************************************************************************************************************************************************
* QUESTION
* Write a program that reads the String representation of an arbitrary number and outputs a line with this number and its Int representation divided by 2.
************************************************************************************************************************************************************/

// SOLUTION
fun main() {
    // write here
    val input = readln()
    val intValue = input.toInt()
    val result = intValue / 2
    println("The obtained value is $intValue and its Int representation is $result")
}
