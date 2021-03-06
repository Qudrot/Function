import kotlin.math.sqrt

/* Write a function that takes the lengths of the two shorter sides of a right triangle as its parameters.
* Return the hypotenuse of the triangle, computed using Pythagorean theorem, as the function’s result.
* Include a main program that reads the lengths of the shorter sides of a right triangle from the user,
* uses your function to compute the length of the hypotenuse, and displays the result.*/

fun main(args: Array<String>) {
    var opposite = 3
    var adjacent = 4
    val hypotenuse = triangleSides(opposite, adjacent)
    println("The hypotenuse of the right triangle with sides $opposite and $adjacent = $hypotenuse")
}

fun triangleSides(a: Int, b: Int): Int {
    val c = sqrt((a*a + b*b).toDouble())
    return c.toInt()
}