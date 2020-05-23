/* Words like first, second and third are referred to as ordinal numbers. In this exercise,
* you will write a function that takes an integer as its only parameter and returns a string
* containing the appropriate English ordinal number as its only result. Your function must handle
* the integers between 1 and 12 (inclusive). It should return an empty string if a value outside of
* this range is provided as a parameter. Include a main program that demonstrates your function by
* displaying each integer from 1 to 12 and its ordinal number. Your main program should only run
* when your file has not been imported into another program. */

fun main(args: Array<String>) {

}

fun ordinalNumber(number: Int): String {
    when(number) {
        1 -> print("First")
        2 -> print("Second")
        3 -> print("Third")
        4 -> print("Fourth")
        5 -> print("Fifth")
        6 -> print("Sixth")
        7 -> print("Seventh")
        8 -> print("Eighth")
        9 -> print("Ninth")
        10 -> print("Tenth")
        11 -> print("Eleventh")
        12 -> print("Twelveth")
        else -> print("")
    }
    return  ""
}