class Shop(var name:  String?)

fun main() {
    val s: Shop? = Shop("Manuel's")
    println(s?.name)
    s?.let {
        println(it.name)
    }
    val a = arrayOf("Emmanuel", "Dominic", null, "Matembu")
    for (item in a) {
        item?.let {
            print("$it ")
        }
    }
    println("")
    println("---${s!!.name}")
    s.name = null
    println(s.name ?: "empty")
    println(s!!.name)

    s.name = "New Value"
    try {
        val x = s.name?.toInt()
        println(x)
    } catch (e: NumberFormatException) {
        // e.printStackTrace()
        println("Can't format value to an integer!")
    } finally {
        println("Close program!")
    }
}
