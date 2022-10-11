import java.util.*

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
