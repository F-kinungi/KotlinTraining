package functions

// recursion function is a function which call itself continuously.
// the technique is called recursion


fun main(args: Array<String>) {

    rec()


    //Recursion

    val number = 5
    val result = factorial(number)
    println("factoral of $number = $result")

    //Tail recursion
    val num = 100000.toLong()
    val result2 = recursiveSum(num)
    println("sum of upto$num = $result2")

    // Tail recursive with factorial

    val numbered = 4
     val result3 = factorial(numbered)
    println("factorial of $numbered = $result3")
}

var count = 0
fun rec(){
    count ++
    if(count <= 5){
        println("hello"+ count)
        rec()
    }
}


// recursion function example 2 factorial number

fun factorial(n: Int) :Long{

    return if (n == 1) {
        n.toLong()
    } else {
        n* factorial(n-1)
    }
}

// Tail recursion

/**
 * Tail recursion is a recursion which performs the calculation first, then makes the recursion call
 * The result of current step is passed into the next recursive call
 *
 *
 * Tail recursive follows one rule for implementation.
 *
 * The recursive call must be the last call of the method.
 * to declare a recursion as recursion we need to use tailrec modifier before the recursive function
 *
 *
 *
 * */


tailrec fun recursiveSum(n:Long,semiResult: Long = 0):Long{

    return if(n <= 0){
        semiResult
    } else {
        recursiveSum((n-1),n+semiResult)
    }
}

tailrec fun factorial(a:Int, run:Int = 1) :Int {

    return if (a == 1) {
        run
    } else {

        factorial(a-1, run*a)

    }
}