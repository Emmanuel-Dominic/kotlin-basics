fun main() {
    val myArray = arrayOf(1, 2, 3, 4, 5)
    for (item in myArray) {
        print(item)
    }

    println("")
    println(myArray.size)
    println(myArray[2]) // myArray.get(2)
    println(myArray.max())
    println(myArray.min())
    myArray[1] = 9 // myArray.set(1, 9)
    for (item in myArray) {
        print(item)
    }

    println("")
    myArray.reverse()
    for (item in myArray) {
        print(item)
    }

    println("")
    myArray.sort()
    for (item in myArray) {
        print(item)
    }

    println("")
    val shopping: List<String> = listOf("Tea", "Eggs", "Milk")
    println(shopping.contains("Milk"))
    println(shopping.indexOf("Milk"))

    val mShopping: MutableList<String> = mutableListOf<String>("Chips", "Bread", "Butter")
    mShopping.add("Biscuit")
    println(mShopping[3])
    mShopping.remove("Biscuit")
    mShopping.removeAt(0)
    mShopping.addAll(shopping)
    mShopping.sort()
    mShopping.reverse()
    mShopping.shuffle()
    for (item in mShopping) {
        print("$item ")
    }

    mShopping.clear()
    for (item in mShopping) {
        print("---$item ")
    }

    println("")
    val shoppingMap: Map<String, String> = mapOf("1" to "Chips", "2" to "Bread", "3" to "Butter", "4" to "Butter")
    println(shoppingMap)
    val mShoppingMap: MutableMap<String, String> = mutableMapOf()
    mShoppingMap.putAll(shoppingMap)
    mShoppingMap["5"] = "Cassava" // mShoppingMap.put("4", "Cassava")
    for ((key, value) in mShoppingMap) {
        println("Key is $key, value is $value")
    }

    mShoppingMap.remove("5")
    println(mShoppingMap.entries)
    if (mShoppingMap.size > mShoppingMap.values.toSet().size) {
        println("mShoppingMap contains duplicates values")
    }
}
