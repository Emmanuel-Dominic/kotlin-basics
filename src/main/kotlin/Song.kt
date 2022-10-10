class Artist(var name: String) {

    var greet: String = "Hello $name"
        get() = field
        set(value) {
            field = value
        }
}

class Song(private val title: String, var artist: String) {

    lateinit var album: String

    init {
        println("Song '$title' has been created!")
    }

    fun play() {
        println("Playing the song '$title' by '$artist' under the '$album'")
    }

    fun stop() {
        println("Stopped playing '$title'")
    }
}

fun main() {
    val songOne = Song("More blessings", "Levixon")
    songOne.album = "1st Album"
    var songs: Array<Song> = arrayOf()
    songs += Song("On my matter", "Ada")
    songs += Song("Enjoy yo blessing", "Levixon")
    songs += songOne
    println("")
    val artists = arrayOf(Artist(songs[0].artist), Artist(songs[1].artist), Artist(songs[2].artist))
    println(artists)
    println(artists[0].greet)
    artists[0].greet = "Hi ${artists[0].name}"
    println(artists[0].greet)
    println("")
    songs[0].album = "2nd Album"
    songs[1].album = "1st Album"
    songOne.play()
    songOne.stop()
}
