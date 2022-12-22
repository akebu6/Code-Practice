fun main() = print(generateSequence { readLine()!!.toInt() }.takeWhile { it != 0 }.maxOrNull())
