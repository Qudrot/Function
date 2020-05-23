/* A number guessing game is one in which the user is prompted to guess a number,
* the number the user supplies is then compared against a pre-stored number and a
* congratulatory message is returned if there is a match. A “game over” message is
* displayed otherwise. You are required to write a program to implement the Number
* Guessing Game. Have your program initialize a variable called num with any number
* of your choice, prompt the user to guess a number and store the guessed number in a
* variable called guess, compared the user guessed number with the number in the
* initialised variable, and returns “You win!” if the numbers are equal and “You lose!”
* if the numbers are not equal, and “Invalid Entry” if the value entered is not a number.
* Write a function to implement the case study 2a above. Give your function the following
* properties: Use parameter(s) Use return statement */
fun main(args: Array<String>) {
    val number = 1..100
    val user = userChoice(number)
    val game = gameChoice(number)
    gamePlay(user, game) }

fun userChoice(option:  IntRange): Int {
    var userChoice: Int = 0
    val char = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz" +
            "\\\"\"/<>?'';:+=()*&^%$#@!~,.||{}[]-_"

    var isValid = false
    println("Enter any number from 1 .. 100")
    while (!isValid) {
        var guess = readLine()

        if (char.contains("$guess")) {
            do {
                println("Invalid entry")
                guess = readLine()
            } while (char.contains("$guess"))
        }
        userChoice = guess!!.toInt()
        if (userChoice > 100){
            do {
                println("You must enter any number from 1 .. 100")
                guess = readLine()
                userChoice = guess!!.toInt()
            } while(userChoice > 100) }

        if (userChoice in option){
            isValid = true
        }
    }
    return userChoice
}

fun gameChoice(option: IntRange): Int { return option.random() }

fun gamePlay(userChoice: Int, gameChoice: Int) : String {
    var result = "You win, Game over"
    if (userChoice == gameChoice) {
        println("You guessed $userChoice, i guessed $gameChoice. $result")
    } else result = "You lose, Game over"
    println("You guessed $userChoice, i guessed $gameChoice. $result")
    return result
}



/*fun userChoice(option:  IntRange): Int {
    var userChoice: Int = 0
    var isValid = false
    println("Enter any number from 1 .. 100")
    while (!isValid) { val guess = readLine()!!.toInt()
        if (guess in option){
            isValid = true
            userChoice = guess
        } else
            println("Invalid Entry, you must enter any number from 1 .. 100") }
    return userChoice }*/