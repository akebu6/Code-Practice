/*
* QUESTION
* There is a function suspiciousFunction, and for some reason you suspect that an exception might occur.
* Process the call of suspiciousFunction with the help of the try-catch-finally statement. If an exception occurs in the function, print an information message about it.
* In the case of IOException, print the following message instead: The IOException occurred.
* In the final block, output Handling completed successfully!.
*/

// SOLUTION
import java.io.IOException
import java.lang.ArithmeticException

fun suspiciousFunction(param: Int) {
    when (param) {
        0 -> throw Exception("Some exceptions?")
        1 -> throw ArithmeticException("Division by zero")
        2 -> throw Exception("An exception occurred here")
        3 -> throw IOException()
    }
}        

fun handleException(data: Int) {
    try {
        suspiciousFunction(data)
    } catch (e: IOException) {
        println("The IOException occurred")
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("Handling completed successfully!")
    }
}


