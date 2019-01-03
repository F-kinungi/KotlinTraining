package acadamy.learningKotlinProgramming.Functions


fun main(args: Array<String>) {

    add()
    additional(5,5)
    val maxIntResult = maxInt(5,3)
    println("The maxInt value is: $maxIntResult")

    val maxInt2Result = maxInt2(10,15)
    println("The value of optimized code is: $maxInt2Result")
}
//non parameterized function
fun add() {
    val a = 10
    val b = 20
    val sum = a + b
    println("The sum of a and b is: $sum")
}
//parameterized function
fun additional( x: Int, y: Int){
      val sum = x + y
    println("The sum of x and y: $sum")
}
// let use if expression inside the function
fun maxInt(a:Int, b:Int):Int{
    if (a > b)
        return a
    else
        return b
}
// let us optimize the above code
fun maxInt2(a:Int, b:Int):Int = if(a > b) a else b
