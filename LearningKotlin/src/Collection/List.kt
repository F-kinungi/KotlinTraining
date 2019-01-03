package Collection

import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * collection in kotlin are used to store group of related objects in a single unit.
 * By using collection, we can store, retrieve manipulate and aggregated data.
 *
 * Types of kotlin collection
 *
 * 1. Immutable collection
 * 2. mutable collection
 *
 * immutable collections supports read only functionalities.Methods of immutable collection that
 * support read functionalities are
 *
 * collection             Methods of immutable collections
 * Types
 *
 *1.List                   listOf()  or listOf<T>()
 *2. Map                    mapOf()
 *3. Set                    setOf()
 *
 *
 * collection             Methods of mutable collections
 * Types
 *
 *1.List                    ArrayList<T>()
 *                          arrayListOf()
 *                          mutableListOf
 *
 *2.Map                      HashMap
 *                           hashMapOf()
 *                           MutableMapOf()
 *
 *
 *3. Set                    hashSetOf()
 *                          MutableSetOf()
 *
 *
 * Kotlin List Interface
 * kotlin List is an interface and generic collection of elements.
 * The List interface inherit from Collection<T> class. It is immutable and its methods supports
 * only read functionalities
 *
 * To use the list interface we need to use its function called listOf(), listOf<E>().
 * The elements of list follow the sequence of insertion order and contains index number
 * same as array
 * public interface List<out E> : Collection<E> (source)
 * */
fun main(args: Array<String>) {

    val items  = listOf<Int>(1,2,4,5,6,7,8,9,10)
    // list you dont need for loop
    println(items)
    println("Number of element in a list: ${items.size}")
    val result = items.drop(2)
    println(result)





}






















