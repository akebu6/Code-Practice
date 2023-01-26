fun main() {
    val n = readLine()!!.toInt()
    val list = MutableList(n) { readLine()!!.toInt() }
    var x = 0
  
    for (i in 0..n - 1) {
        if (list[i] > list[x]) {
            x = i
        }
    }
    println(x)
}
