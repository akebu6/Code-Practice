import java.math.BigInteger

fun main() {
    val input: BigInteger = BigInteger(readln())
    val SIXTY_THREE=63
    val result: BigInteger = input * BigInteger.TWO.pow(SIXTY_THREE)
    println(result)
}