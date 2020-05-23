/* Write a function that takes three numbers as parameters, and returns the median value
* of those parameters as its result. Include a main program that reads three values from
* the user and displays their median.
    * Hint: The median value is the middle of the three values when they are sorted into ascending
    * order. It can be found using if statements, or with a little bit of mathematical creativity. */

fun main(args: Array<String>) {
    println("Enter three integers")
   val entry = medianValue(readLine()!!.toInt(), readLine()!!.toInt(), readLine()!!.toInt())
    println("The median of the three numbers is $entry")
}

fun medianValue(a: Int, b: Int, c:Int): Int {
    val median = arrayOf(a, b, c)
    median.sort()
    return median[1]
}