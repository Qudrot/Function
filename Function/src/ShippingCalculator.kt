/* An online retailer provides express shipping for many of its items at a rate of $10.95
* for the first item, and $2.95 for each subsequent item. Write a function that takes the
* number of items in the order as its only parameter. Return the shipping charge for the
* order as the function’s result. Include a main program that reads the number of items
* purchased from the user and displays the shipping charge.*/

 fun main(args: Array<String>) {
     val cart = products(15)
     println("Shipping cost of items in the cart = $$cart")
 }

fun products(items: Int): Double {
    return 10.95 + 2.95*(items -1)
}