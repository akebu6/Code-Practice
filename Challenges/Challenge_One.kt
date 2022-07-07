/* QUESTION
Read three lines. You need to check whether the third line is equal to the sum of the first two lines.
If the first two lines put together form the third one, print true; otherwise – false.
*/

// SOLUTION
fun main() {
    val wordOne = readln()
    val wordTwo = readln()
    val wordThree = readln()
    val result = wordOne + wordTwo

    if (result == wordThree) {
        println("true")
    } else {
        println("false")
    }
}
