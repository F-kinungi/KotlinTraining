package functions

fun main(args: Array<String>) {
    val result = sum(3,5)
    println("sum of num is $result")

    val  result2 = add(4,6)
    println("add = $result2")

    val num1 = 10.5
    val num2 = 5.5

    val result3 = calcValues(num1, num2)
    println("the result of parameters is: $result3")

}

fun sum(a:Int, b:Int) : Int {
    return a + b
}
// function with expression body and inferred return type
//parameter inside the function are always immutable.
// and therefore you cannot ue the word var
fun add(x:Int, y:Int) = x + y

fun calcValues(param1:Double, param2:Double,op:String = "+"):Double{

    if (op.equals("+")){
        return param1 + param2
    } else if (op.equals("-")){
        return  param1 - param2
    }else {
        return -1.0
    }
}
