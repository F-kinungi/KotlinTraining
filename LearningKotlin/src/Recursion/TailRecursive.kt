package Recursion

import java.math.BigInteger

fun main(args: Array<String>) {
    val n = 10
    val first = BigInteger("0")
    val second = BigInteger("1")
    println(fibonacci(n, first,second))

    // factorial
    val number = 5
    println("factorial of $number = ${factorial(number)}")
}
tailrec fun fibonacci(n:Int, a:BigInteger, b:BigInteger):BigInteger {
  return  if (n == 0) a
    else
        fibonacci(n-1, b, a+b)

}

// tail recursive with factorial

tailrec fun factorial(n: Int, run:Int = 1):Long {
    return  if (n==1)
        run.toLong()
    else
        factorial(n-1, run*n)
}