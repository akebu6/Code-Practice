/*
*   QUESTION
* A bit is the main and the smallest unit of information. Though, we often use other units of information to measure large amounts of data.
Write a program that reads an integer number of exbibyte and converts this amount of information into bits.
*/

// SOLUTION
fun main() {
    val input: BigInteger = BigInteger(readln())
    val result: BigInteger = input * BigInteger.TWO.pow(SIXTY_THREE)
    println(result)
}
