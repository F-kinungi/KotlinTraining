package variables

import kotlin.math.round


fun main(args: Array<String>) {
    val nam1 = 15
    val nam2 = 20

    // this is more efficient
    val match: Boolean = (nam1 == nam2)
    println("match is: $match")
    // alternative
    val match2:Boolean = nam1.equals(nam2)
    println(match2)


    // we cal also perform mathematics expression in here
    val sum: Int  = nam1 + nam2
    println("The sum is: $sum")
    val sum2: Int = nam1.plus(nam2)
    println("The sum is: $sum2")


    val neg = -134.54
    val absolute = Math.abs(neg)
    println("absolute is: $absolute")
    println("rounded = ${round(absolute)}")



}