import kotlin.random.Random

fun rpgDices(dice1: Int, dice2: Int): Int {
    return Random.nextInt(1, dice1 + 1) + 
            Random.nextInt(1, dice2 + 1)
}
