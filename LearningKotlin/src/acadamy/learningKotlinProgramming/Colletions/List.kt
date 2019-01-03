package acadamy.learningKotlinProgramming.Colletions


/**
 *  Immutable List
 *  List in kotlin are interface and generic collection of elements.
 *  The List interface inherit from Collection<T> class
 *  To use the List interface we need to use its function called listOf(), listOf<E>()
 *  we use listOf() or listOf<T>()method to initialize immutable list
 *
 *  we can provide generic type explicitly while initializing  list or we can let kotlin infer the type implicitly
 *
 *  just like array, list can contain items of mixed data type
 * */
fun main(args: Array<String>) {


    val list = listOf<Any>("Susan","Mary", "Diasy","Francis","Grace",2, 3, 4 ) //immutable list of fixed size and read Only
    for (element in list){
        println(element)
    }
    val intList = listOf(2,3,4,5)
    // let see different functions that can be used on list
    println(list.get(0)) //return element of index 0 in the list
    println(list.indexOf("Francis")) // return index of the chosen element. if the element is not present, it returns -1
    println(list.lastIndexOf("Francis"))
    println(list.size)
    println(list.contains("Kinungi"))
    println(list.containsAll(list))
    println(list.subList(1, 4))//It returns a part of list between fromIndex (inclusive) to toIndex (exclusive).
    println(list.isEmpty())
    println(list.asReversed())
    println(list.drop(1))
    println(list.dropLast(3))
    println(intList.first() == 1)
    println(intList.filter { it % 2 ==0 })
    println(intList.dropWhile { it <= 3 })
    println(intList.groupBy {it % 2})
    println(intList.map { it * it })
   // val res = list.flatMap
    val result = intList.fold(0) { acc, i ->  acc + (i * i)}
    println(result)

}
// The limitation of List interface is that it is immutable. It cannot add more element in the list once declared.

/**
 *    Kotlin List
 * Kotlin List is an interface
 *
 * */