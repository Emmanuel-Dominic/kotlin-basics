interface Move {
    fun move() {
        println("I am moving!")
    }
}

class People: Move

class Vehicle: Move {
    override fun move() {
        println("Move by driving!")
    }
}

abstract class Animal: Move {
    abstract val food: String
    abstract val habitat: String
    var hunger: Int = 10

    abstract fun sound()

    open fun roam() {
        println("The animal is roaming.")
    }

    override fun move() {
        println("Move by locomotion!")
    }

    fun sleep() {
        println("Time to sleep.")
    }
}

abstract class Canine: Animal()

abstract class Feline: Animal() {
    fun eat() {
        println("I eat $food")
    }
}

class Hippo: Animal() {
    override val food: String
        get() = "grass"
    override val habitat: String
        get() = "water"

    override fun sound() {
        println("The grunt is from a hippo")
    }
}

class Wolf: Canine() {
    override val food: String
        get() = "meat"
    override val habitat: String
        get() = "forest"

    override fun sound() {
        println("The Hoooooow is from a wolf")
    }
}

class Cheetah: Feline() {
    override val food: String
        get() = "meat"
    override val habitat: String
        get() = "flatland"

    override fun sound() {
        println("The meow is from a cheetah")
    }
}

fun main() {
    println("---animals---")
    val animals: Array<Animal> = arrayOf(
        Hippo(), Wolf(), Cheetah()
    )
    for(animal in animals){
        animal.sound()
        println("")
    }
    println("---cheetah---")
    val cheetah = Cheetah()
    cheetah.eat()
    cheetah.sound()
    cheetah.roam()
    cheetah.move()
    cheetah.sleep()
    println("")
    println("---vehicle---")
    val car = Vehicle()
    car.move()
    println("")
    println("---person---")
    val person = People()
    person.move()
}
