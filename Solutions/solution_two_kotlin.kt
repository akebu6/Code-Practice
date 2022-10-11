
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
