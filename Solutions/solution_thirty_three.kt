import kotlin.math.pow
import kotlin.math.sqrt

const val PI = 3.14

fun main() {
    when (readln()) {
        "triangle" -> {
          val a = readln().toDouble()
          val b = readln().toDouble()
          val c = readln().toDouble
          val p = (a + b + c) / 2

          println(sqrt(p * (p - a) * (p - b) * (p - c)))
        }
        "circle" -> println(readln().toDouble().pow(2) * PI)
        "rectangle" -> println(readln().toDouble() * readln().toDouble())
    }
}
