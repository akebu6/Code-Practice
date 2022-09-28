/************************************************************************************************************************
* QUESTION
* Write a function solution that reads two numbers from the input and prints the first number divided by the second.
*
* If an exception occurs, print the exception's message.
*
* In the final block, the output will be This is the end, my friend.
*************************************************************************************************************************/

// SOLUTION
fun solution() {
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    var result = 0
    
    try {
        result = firstNumber / secondNumber
        println(result)
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("This is the end, my friend.")
    }
}
