package acadamy.learningKotlinProgramming.TailRecFunction

import java.math.BigInteger

/**
 * TailRec Functions [Recursion Function]
 *
 * Recursion function is a function which call itself continuously
 *
 * fun functionName(){
 *
 * functionName() // calling the same function
 * }
 * */
var count = 0
fun rec(){
    count++
    if(count <= 5){
        println("hello $count")
        rec()
    }
}
fun main(args: Array<String>) {
    rec()
    val fibResult = getFibonacciNumber(10000, BigInteger("1"), BigInteger("2"))
    println(fibResult)

    val number = 5.toLong()
    val recResult = recursiveSum(number)
    println(recResult)

    // factorial
    val num  = 5
    val factResult = factorial(num)
    println(factResult)

}
//fibonacci number  0,1,1,2,3,5,8,13,21,34,55,89.....
 tailrec fun getFibonacciNumber(n:Int, a:BigInteger, b:BigInteger):BigInteger{
    return if (n==0)
        b
    else
        getFibonacciNumber(n-1, a + b, a)
}
tailrec fun recursiveSum(n:Long, semiResult: Long = 0):Long {

    return if(n <= 0)
        semiResult
    else
        recursiveSum((n-1), n+semiResult)

}
// factorial with recursion
fun factorial(n: Int, run:Int=1): Int{
    return  if (n == 1)
        run
    else
        factorial(n-1, run*n)
}