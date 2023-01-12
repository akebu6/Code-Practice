fun main() {
    val totalSeconds = System.currentTimeMillis()
    val hours = totalSeconds / 60 / 60 % 24
    val minutes = totalSeconds / 60 % 60
    val seconds = totalSeconds % 60
  
    print(hours)
    print(":")
    print(minutes)
    print(":")
    print(seconds)
}
