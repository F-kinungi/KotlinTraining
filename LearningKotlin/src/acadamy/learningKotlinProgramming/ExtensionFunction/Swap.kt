package acadamy.learningKotlinProgramming.ExtensionFunction


fun main(args: Array<String>) {

    val list = mutableListOf(5,10,15)
    println("before swapping the list $list")

    val result =list.swap(0,2)
    println("After swapping the list $result")
}

fun MutableList<Int>.swap(index1:Int, index2:Int):MutableList<Int> {

    val tmp = this[index1] // this keyword represent the list
    this[index1] = this[index2]
    this[index2] = tmp
    return this
}