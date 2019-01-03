package acadamy.learningKotlinProgramming.OperatorFunctions




fun main(args: Array<String>) {
    val result = composed(5)
    println(result)



}

fun same( num :Int) = num
fun twice(num:Int) = num * 2
fun thrice(num:Int)= num * 3
fun composed(num:Int) = same(twice(thrice(num*4)))
