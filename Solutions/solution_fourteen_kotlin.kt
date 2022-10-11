fun main(){
val n = readln().toInt()
var numCurrent = 0
var numPrinted = 1
while (numPrinted <= n) {
    repeat(numCurrent) {
        if (numPrinted <= n) {
            print("$numCurrent ")
            numPrinted++
        }
    }
    numCurrent++
}
}
