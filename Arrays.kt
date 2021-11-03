fun main()
{
    println("Hello World")
    //println("What is your name?")
    //val name = readLine()
    //println("Hello $name!, nice to meet you")
    val x = 10
    //println("Before x was incremented. x = $x")
    //while (x < 4)
    //{
    //println("In the loop. x = $x")
    //x += 1
    //}
    //println("After the loop. x = $x")

    val y = 7
    println(if(x < y) "x is less than y" else "x is greater than y")
    println("This line runs no matter what")

    //conversion of types
    val b: Int = 12
    val z: Long = b.toLong()

    println(z)

    //using arrays
    var myArray = arrayOf(1, 2, 3, 4)
    var mySize = myArray.size
    println("Size of the array: $mySize")
    myArray[3] = 10 //updating the value at index 3
    println("The index 3 now contains: ${myArray[3]}")

    for (b in 1..4) println("B is: $b")//using a for loop for the first time
    for (b in 1 until 4) println("B is: $b") //using the until to loop through
    for (b in 14 downTo 4) println("B is: $b") //using the downTo too reverse the order
    for (b in 1..6 step 2) print("B is: $b") //stepping through while skipping some values


}