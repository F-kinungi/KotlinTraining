package KotlinCollection2

import variables.name
import kotlin.test.assertEquals

fun main(args: Array<String>) {


    val originalList = listOf<Int>(1,2,3,4,5)
    println(originalList)

    println("*********** looping through the element in list ")
    for (numbers in originalList)
    println(numbers)

   // searching mechanism with the list
    println(originalList[2])

    print("******* using filter method on the element"+"\n")
  val result = originalList.filter{ it % 2 == 0}
    for (x in result)
    println(x)

    print("******* using getorelse method on the element"+"\n")
    val result2 =originalList.getOrElse(4){4}
    assertEquals(5,result2)
    println(result2)

    // creating another list
    val names = listOf<String>("james", "Mary", "susan")

    println("********Usint '+' operator to combine two operator")
     val resultList = names + originalList
    println(resultList)
     // using for loop to traverse through the element.
    for (combination in resultList)
        println(combination)

    println("*****************doWhile operattor" +"\n")
    val resultList2 = originalList.dropWhile { it < 2 }
    println(resultList2)

    val resultList3 = originalList.find { it < 2 }
    println(resultList3)

    val resultList4 =originalList.groupBy { it % 3 }
    println(resultList4)

    val resultList5 =originalList.map { it * it }
    println(resultList5)

    val resultList6 =names.flatMap { it.toLowerCase().toList() }

    println(resultList6)

    val resultList7 =originalList.fold(0, {acc, i -> acc + (i * i) })
    println(resultList7)

    val list = listOf<Int>(1,2,3,4)
    val list2 = listOf<Int>(5,6,7,8)
    val listressult = list + list2
    println(listressult)
     val n = listOf<String>("A","B","C")




}