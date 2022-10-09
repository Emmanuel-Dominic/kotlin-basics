fun main() {
    val name = "Dominic"
    println("Hello $name")

    val numList =  arrayOf(1, 2, 3)
    var x = 0

    while(x < 3) {
        println("$x, ${numList[x]}")
        x += 1
    }
}