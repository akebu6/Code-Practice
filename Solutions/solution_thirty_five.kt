fun main(){
    // Enter your string here
    var userString: String = "siddiq"

    if(userString[0] == 'i'){
        println("String starts with i")
        val newString = userString.removeRange(0,1)
        println("New string after removing i  is $newString")
        if(userString.contains("[0-9]".toRegex())){
            println("String contains a number")
            for(i in 0 until userString.length){
                if(userString[i].isDigit()){
                    val index = i
                    val numVal = userString[i] + 1
                    println("Incremented value of the number is $numVal")
                    val preNumberString = userString.removeRange(index, userString.length)
                    val postNumberString = userString.removeRange(0, index+1)
                    val newString = preNumberString  + numVal + postNumberString
                    println("New string is $newString")
                    userString = newString
                }
            }
        } else{
            println("String does not contain a number")
        }
    } else if(userString.contains("[0-9]".toRegex())){
        println("String contains a number")
        for(i in 0 until userString.length){
            if(userString[i].isDigit()){
                val index = i
                val numVal = userString[i] + 1
                println("Incremented value of the number is $numVal")
                val preNumberString = userString.removeRange(index, userString.length)
                val postNumberString = userString.removeRange(0, index+1)
                val newString = preNumberString  + numVal + postNumberString
                println("New string is $newString")
                userString = newString
            }
        }
    } else if(userString[0] == 's'){
        val newString = userString.removeRange(0,1)
        val reversedString = newString.reversed()
        println(reversedString)
    } else{
        println(userString)
    }
}