fun main() {
    val a = 1
    val b: Double = a.toDouble() + 1
    println(b)

    val c = 2L
    var d = c * 1
    println(d)

    d = 8
    println(d)

    val wordArray = arrayOf("process", "paradigm", "solution", "leveraged", "vision")
    val arraySize = wordArray.size
    val rand = (Math.random() * arraySize).toInt()

    val phrase = wordArray[rand]

    println(arraySize)
    println(phrase)

    println("\n\n")
    for (i in 1..10){
        println(i)
        if (i > 5) println("Hi")
        else println("Hello")
    }
}