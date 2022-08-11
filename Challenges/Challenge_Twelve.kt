/**************************************************************************************************************************************************
* QUESTION
*
* You want to hack a website and get all available parameters. Print them "key : value". If a parameter doesn't have value, print "not found".
* 
* If you find the password (parameter pass), you should print its value after all parameters once again, but with a key password. If a URL does not contain a parameter pass, do not print anything after parameters. But if the pass parameter is present, its value cannot be empty
* 
* Note: the order of parameters should be like as in the URL.
* Advice: learn the structure of URL.
*****************************************************************************************************************************************************/

// SOLUTION
fun main() {
    val input = readln()
    val p = "pass="
    val passIsPresent = input.contains(p) && !input.contains("$p&") && !input.endsWith(p)
    var pass = ""
    val infos = input.substringAfter('?').split("&")

    for (info in infos) {
        if (info.contains("pass=") && passIsPresent) {
            pass = info.substringAfter("=")
            println("pass : $pass")
        } else if (info.endsWith('=')) {
            println(info.replace("=", " : not found"))
        } else {
            println(info.replace("=", " : "))
        }
    }

    if (passIsPresent) println("password : $pass")
}

