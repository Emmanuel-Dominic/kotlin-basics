//Rock, Paper, Scissors Game
//Goal: Make a guess that beats the computer’s, and win!
//Setup: When the application is launched, the game chooses Rock, Paper or Scissors at random. It then asks you to choose one of these options.
//The rules: The game compares the two choices. If they are the same, the result is a draw. If the choices are different, however, the game determines the winner using the following rules:
//Choices               |    Results
//Scissors, Paper       |    The Scissors choice wins, as Scissors cut paper
//Rock, Scissors        |    The Rock choice wins, as Rock can blunt Scissors
//Paper, Rock           |    The Paper choice wins, as Paper can cover Rock

fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionParam: Array<String>) = optionParam[(Math.random() * optionParam.size).toInt()]

fun getUserChoice(optionParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while(!isValidChoice) {
        for((index, item) in optionParam.withIndex()) print(" ${index + 1}: $item")
        println(".")
        print("Please enter your option: ")
        val userInput = readLine()?.replaceFirstChar(Char::titlecase)

        if(userInput != null && userInput in optionParam) {
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice:String) {
    val result: String = if (userChoice == gameChoice) {
        "we tie!"
    }else if ((userChoice=="Rock" && gameChoice=="Scissors") || (userChoice=="Paper" && gameChoice=="Rock") || (userChoice=="Scissors" && gameChoice == "Paper")) {
        "you win!"
    }else {
        "you lose!"
    }
    println("You chose $userChoice and I chose $gameChoice, so $result")
}