/*************************************************************************************************
* Write a program that reads a string and then output another string with doubled characters.
***********************************************************************************************/

// SOLUTION
fun main() {
    val input = readln()
    var newString = ""
    for (i in 0 until input.length) {
        newString += input[i]
        newString += input[i]
    }

    print(newString)
}

// OTHER SOLUTION
fun main() {
    readln().map { print("$it$it") }
}
