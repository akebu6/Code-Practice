/*
QUESTION:
All the letters of the English alphabet are divided into vowels and consonants.
The vowels are: a, e, i, o, u, y.
The remaining letters are consonants.

A word is considered euphonious if it doesn't have three or more vowels or consonants in a row. Otherwise, it is considered discordant.

Your task is to create euphonious words from the discordant ones. You can insert any letters inside the word. Output the minimum number of characters needed to create a euphonious word from a given word.

For example, the word "schedule" is considered discordant because it has three consonants in a row: "sch". To create a euphonious word you need to add any vowel between 's' and 'c' or between 'c' and 'h'.

*/

// SOLUTION
const val VOWELS = "aeiouy"
const val THREE = 3
fun main() {
    val inputWord = readln()
    var chCounter = 0
    var vowelCounter = 0
    var consonantCounter = 0

    for (i in inputWord) {
        if (i.toString() in VOWELS) {
            vowelCounter++
            consonantCounter = 0
        } else {
            consonantCounter++
            vowelCounter = 0
        }
        if (vowelCounter == THREE || consonantCounter == THREE) {
            chCounter++
            vowelCounter = 1
            consonantCounter = 1
        }
    }
    println(chCounter)
}
