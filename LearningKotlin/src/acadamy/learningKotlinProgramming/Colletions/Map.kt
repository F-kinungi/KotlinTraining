package acadamy.learningKotlinProgramming.Colletions

import variables.name

/**
 *   Kotlin Map
 * Kotlin Map is an interface and generic collection of elements. Map interface holds data in the
 * form of key and value pair. Map key are unique an holds only one value for each key.
 * The key and value maybe of different pairs such as <Int, Int>, <Int, String> <Char, String> etc
 * This interface is immutable, fixed size and its methods support read only access.
 *
 * To use Map interface we need to use its function called mapOf() or mapOf<k,v>()
 * */


fun main(args: Array<String>) {

    // example of map interface with generic
    val myMap = mapOf<Int, String>( 1 to "Susan", 2 to "Francis", 3 to "Daisy")
    for (key in myMap.keys)
        println("Element at key = $key values = ${myMap.get(key)}")

    // example of map interface with without generic. if we don't specify the generic then key and value will be of type any

    val myMap2 = mapOf(1 to "Susan", 2 to "Francis", 3 to "Daisy", "vin" to "sam")

    println("************use iterator to traverse through the element in Map interface")
    val iterator = myMap2.iterator()
    while (iterator.hasNext())
        println(iterator.next())

    // getValue function
    println("Value of key 3 is : " +myMap2.getValue("vin"))
    println("Check what contain in 1 : " +myMap2.contains(1))

println("******************using filter and map together")

    val listNumber = listOf(1,2,3,4,5,6,7,8,9,10,23,24,42,56)
    val result =listNumber.filter { it %2 == 0 }.map { it * it }

    println(result)

    //for (element in listNumber)

    // example of predicates or condition
    println("******' working with predicate and condition ")
    val numbers = listOf(3,4,5,6,7,8,9,10,23,24,42,56)
    val myPredicate = { num:Int -> num  > 10 }
    val check1 = numbers.all(myPredicate)
    println(check1)
    val check2 = numbers.any(myPredicate)
    println(check2)
    val check3 = numbers.count(myPredicate)
    println(check3)
    val check4 = numbers.find (myPredicate)
    println(check4)


}



















