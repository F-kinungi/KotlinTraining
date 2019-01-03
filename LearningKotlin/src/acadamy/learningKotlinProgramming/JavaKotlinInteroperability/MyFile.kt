package acadamy.learningKotlinProgramming.JavaKotlinInteroperability

import acadamy.learningKotlinProgramming.Functions.add

fun main(args: Array<String>) {
    // calling java class to kotlin

    val area = MyJavaFile.getArea(10,5)
    println("The area of a rectagle is: $area")
}
fun add(a:Int, b:Int):Int {
    return a + b
}