open class Person(open var firstName: String, open var lastName: String, open var age: Int) {
    open var isKnown: Boolean = false

    fun name() {
        println("$firstName $lastName")
    }
    open fun act() {
        println("Live a normal lifestyle.")
    }
}

open class RockStar(override var firstName: String, override var lastName: String, override var age: Int): Person(firstName, lastName, age) {
    override var isKnown: Boolean = true
    override fun act() {
        println("Being popular is invitable.")
    }

    fun known() {
        println("I am well known here.")
    }
}

class Musician(var fullName: String, override var age: Int): RockStar(fullName.split(" ")[0].trim(), fullName.split(" ")[1].trim(), age) {
    override fun act() {
        println("Singing is my hobby me as $fullName")
    }
}

class Track(private var artists: Array<Musician>, var title: String, var genre: Int = 0) {
    var musicians: Array<String> =  arrayOf()

    init {
        for (element in artists) musicians += element.firstName
        for (element in musicians) print("$element ")
        println("")
    }

    fun list(){
        println("$artists - $genre")
    }
}

class Album(private var tracks: Array<Track>) {
    var album: Array<String> = arrayOf()

    init {
        for (element in tracks) album += element.title
        for (element in album) print("$element ")
        println("")
    }

    fun show() {
        println(tracks)
    }
}

fun main() {
    val musicianOne = Musician("Ada Ehi", 34)
    val musicianTwo = Musician("Onos Ariyo", 33)
    println("----------------Tracks----------------")
    val trackOne = Track(arrayOf(musicianOne), "In your name", 1)
    val trackTwo = Track(arrayOf(musicianTwo), "Holy is your name", 2)
    val trackThree = Track(arrayOf(musicianOne, musicianTwo), "I receive your light", 1)
    trackThree.list()
    println("----------------Albums----------------")
    val albumOne = Album(arrayOf(trackTwo, trackThree))
    val albumTwo = Album(arrayOf(trackOne))
    albumOne.show()
    albumTwo.show()
    println("-----------Persons(Musicians)-----------")
    val persons: Array<Person> = arrayOf(musicianOne, musicianTwo)
    for (person in persons) {
        musicianOne.known()
        musicianTwo.name()
    }

}
