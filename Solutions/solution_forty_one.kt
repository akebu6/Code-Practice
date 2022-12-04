fun main() {
    val bio = readln()
    var count = 0
    for (i in bio) {
        if (i == 'c' || i == 'g' || i == 'G' || i == 'C') count++
    }
    print(count / bio.length.toDouble() * 100)
}
