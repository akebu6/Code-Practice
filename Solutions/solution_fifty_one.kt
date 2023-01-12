fun pepTalk(name: String): String {
  val array = name.split(" ").toTypedArray()
  val firstName = array[0]
  val secondName = array[1]
  return "Don't lose the towel, traveler $firstName $secondName!"
}

fun main() {
  val name = readLine()!!
  println(
  try {
  pepTalk(name)
  } catch (e: Exception) {
  "Don't lose the towel, nameless one."
  } finally {
  println("Good luck!")
  }
}
