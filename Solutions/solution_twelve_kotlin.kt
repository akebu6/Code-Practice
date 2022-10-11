val input = readln()
val p = "pass="
val passIsPresent = input.contains(p) && !input.contains("$p&") && !input.endsWith(p)
var pass = ""
val infos = input.substringAfter('?').split("&")
fun main(){
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

