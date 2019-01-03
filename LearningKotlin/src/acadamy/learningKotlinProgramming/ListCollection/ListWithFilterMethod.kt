package acadamy.learningKotlinProgramming.ListCollection

fun main(args: Array<String>) {


    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    val filterList = numbers.filter { it%2 ==0 }
    println(filterList.toString())

    //filterTo method. it appends all element matching the given predicate
    var list  = mutableListOf(100)

    var reuslt =filterList.filterTo(list, {it%2 == 0})

    println("Result after appending mutable value: \n $reuslt")
}
