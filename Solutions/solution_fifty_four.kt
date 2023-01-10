const val NINE = 9
const val THIRTEEN = 13
const val FOURTEEN = 14
const val EIGHTEEN = 18

fun main() {
val time = readln().toInt()
val workTime = NINE..EIGHTEEN
val lunchTime = THIRTEEN..FOURTEEN

if (time in workTime) {
    if (time in lunchTime) { print("false") } else { print("true") }
} else { print("false") }
}
