/* In a particular jurisdiction, taxi fares consist of a base fare of $4.00, plus $0.25
for every 140 meters traveled. Write a function that takes the distance traveled (in
kilometers) as its only parameter and returns the total fare as its only result. Write a
main program that demonstrates the function.
Hint: Taxi fares change over time. Use constants to represent the base fare and
the variable portion of the fare so that the program can be updated easily when
the rates increase.*/
fun main(args: Array<String>) {
    val kilometers = 600
    var taxiFare = distanceFee(kilometers)
  // println(distanceFee(readLine()!!.toInt()))
    println("The distance travelled in kilometers is $kilometers  and the charge is $$taxiFare")
}

fun distanceFee(distance: Int): Double {
    val baseFee = 4.00
    var extraFee = 0.25
    var totalFare = 0.0
    var extraMeters = 140

    if (distance < extraMeters) {
        totalFare = baseFee
    } else
    if (distance == extraMeters) {
        totalFare = baseFee + extraFee
    }
    while (distance > extraMeters) {
        extraMeters += 140
        extraFee += 0.25
        totalFare = baseFee + extraFee
    }
    return totalFare
}