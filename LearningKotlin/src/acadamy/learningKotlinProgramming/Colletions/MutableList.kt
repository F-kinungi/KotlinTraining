package acadamy.learningKotlinProgramming.Colletions

/**
 *   he methods of MutableList interface supports both read and write functionalities
 *   To use the MutableList interface we use its function called mutableListOf() or mutableListOf<E>().
 *   The elements of MutableList follow the sequence of insertion order and contains index number same as array.
 * */
fun main(args: Array<String>) {


    val list = mutableListOf<String>("Susan", "Francis", "Joshua", "Grace", "Helen") // it can be empty
    for (element in list) {
        println(element)
    }
    list.add(1, "Mary")
    println(list)

    list.add("Joseck")
    println(list)

    val list2 = list.subList(1,4)
    println(list2)
}
