/******************************************************************
 * A simple program using arrays that randomly generates a phrase *
 * ****************************************************************/
fun main()
{
    // creating arrays to store the different phrases that will be used
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to_B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    // randomly generate 3 phrases using Java's Math.random function
    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    // display the randomly generated phrase
    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)

} // end of main