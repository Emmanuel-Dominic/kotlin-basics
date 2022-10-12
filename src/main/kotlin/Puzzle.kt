//Our goal is to create the code that will produce the output listed.
//Rectangle 0 has area 15. It is not a square
//Rectangle 1 has area 36. It is a square
//Rectangle 2 has area 63. It is not a square
//Rectangle 3 has area 96. It is not a square

class Rectangle(var width: Int, var height: Int) {
    val isSquare: Boolean
        get() = (width == height)
    val area: Int
        get() = (width * height)
}

fun main() {
    val r = arrayOf(Rectangle(1, 1), Rectangle(1, 1), Rectangle(1, 1), Rectangle(1, 1))
    for (x in 0..3){
        r[x].width = (x + 1) * 3
        r[x].height = x + 5
        print("Rectangle $x has area ${r[x].area}.")
        println("It is ${if(r[x].isSquare) "" else "not "}a square.")
    }
}
