/***************************************************************************************************************************
* Write a simple calculator that reads three values from the line: the first number, the operator and the second number.
*
* The program should apply the operation to the numbers and output the result. Note that the numbers are long.
* 
* The calculator must support:
*
* addition: +
* subtraction: -
* integer division: /
* multiplication: *
* If a user performs the division and the second number is 0, output Division by 0!
*
* If the input operator is not in the list, output Unknown operator.
************************************************************************************************************************/

// SOLUTION
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val inputOne = scanner.nextLong()
    val inputOperator = scanner.next()
    val inputTwo = scanner.nextLong()

    when (inputOperator) {
        "+" -> println(inputOne + inputTwo)
        "-" -> println(inputOne - inputTwo)
        "*" -> println(inputOne * inputTwo)
        "/" -> if (inputTwo == 0L) println("Division by 0!") else println(inputOne / inputTwo)
        else -> println("Unknown operator")
    }
}
