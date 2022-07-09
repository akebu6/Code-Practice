/*
* QUESTION
* Write a program that finds the frequency of occurrences of substring in given string.
Input data format[
The first input line contains a string, the second one contains a substring.
*/

// SOLUTION
fun main() { 
    val phrase = readln().replace(" ", "")
    val word = readln()
    val result = phrase.split(word)

    println(result.lastIndex)
}
