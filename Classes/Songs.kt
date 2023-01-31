// creating a class called Dog that will be used to create the dog objects later in the main function
class Song(val title: String, val artist: String)
{
    //creating a function called play to play the song
    fun play()
    {
        println("Playing $title by $artist")
    }

    //creating a function stop playing the song
    fun stop()
    {
        println("Stopped playing $title")
    }
} // end of song class

fun main()
{
    val songOne = Song("Sugar Wraith", "Post Malone") //creating an object called songOne
    val songTwo = Song("Same Bitches", "Post Malone") //creating another object of type Song
    val songThree = Song("Bad Girls", "Westlife") //creating another object of type Song

    songOne.play() //playing song one
    songOne.stop() //now stopping it
    songThree.play() //now playing song three
    songThree.stop() //stopping it now
    songTwo.play() //playing song two

} // end of main