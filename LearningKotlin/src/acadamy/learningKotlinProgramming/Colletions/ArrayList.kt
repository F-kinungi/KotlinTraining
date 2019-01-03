package acadamy.learningKotlinProgramming.Colletions

/**
 *      Kotlin ArrayList class
 * Kotlin ArrayList class is used to create a dynamic array. which means the size
 * of ArrayList class can be increased or decreased according to requirement.
 * ArrayList class provides both read and write functionalities
 *
 * Kotlin ArrayList class follows the sequence of insertion.
 * ArrayList class is non synchronized and it may contains duplicate elements.
 * The elements of ArrayList class are accessed randomly as it works on index basis
 *
 * Constructor of kotlin ArrayList
 *
 * ArrayList<T>()
 * ArrayList(capacity:Int)
 * ArrayList(elements: Collection<E>)

 *
 * */


fun main(args: Array<String>) {
    val arrayList = ArrayList<String>() // create empty list
    arrayList.add("Alex")
    arrayList.add("Chris")
    arrayList.add("foxfox")
    arrayList.add("Nikkison")
    arrayList.add("Daudi")
    for (i in arrayList)
        println(i)
    println("get specified element: ${arrayList.get(1).toUpperCase()} is my husband")

    println("set() set given element and replace if any element is present ${arrayList.set(0, "Miguel")}")
    println(arrayList)

    val arrayList2 = ArrayList<Int>(5) // initialize its intial capacity
    arrayList2.addAll(1..5)
    println(arrayList2)
    println("***********Using iterator to traverse through the element")
    // use iterator to traverse
    val iterator = arrayList2.iterator()
    while (iterator.hasNext())
        println(iterator.next())
}
















