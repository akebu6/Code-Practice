fun main() {
    val phrase = readln().replace(" ", "")
    val word = readln()
    val result = phrase.split(word)

    println(result.lastIndex)
}
