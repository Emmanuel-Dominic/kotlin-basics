data class Recipe(val title: String, val isVegetarian: Boolean)

class Dance(val name: String, val isKnown: Boolean) {
    constructor(isKnown_param: Boolean): this("House", isKnown_param)
}

fun main() {
    val r1 = Recipe("Chicken Runa", false)
    val r2 = Recipe("Chicken Runa", false)
    val r3 = r1.copy(isVegetarian = true)
    println(r1==r2) // println(r1.equals(r2))
    println(r3==r2)
    val (title, vegetarian) = r3
    println(title)
    println(vegetarian)

    val dance1 = Dance("Hip Hop", true)
    val dance2 = Dance(true)
    println(dance1.name)
    println(dance1.isKnown)
    println(dance2.name)
}
