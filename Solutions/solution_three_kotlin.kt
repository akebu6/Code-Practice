import java.math.BigInteger

fun main() {
    val input: BigInteger = BigInteger(readln())
    val result: BigInteger = input * BigInteger.TWO.pow(63)
    println(result)
}