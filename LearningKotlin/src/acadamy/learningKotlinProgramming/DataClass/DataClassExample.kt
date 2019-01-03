package acadamy.learningKotlinProgramming.DataClass



fun main(args: Array<String>) {

    val user1 = User("sam", 10)
    val user2 = User("sam", 10)

    println(user1)//we are implicitly calling toString method in data class

    val newUser = user1.copy(id = 5)
    println(newUser)

    if (user1 == newUser){ // user1 and user2 are comparing the values and not the object.
        println("Equal")
    }
    else{
        println("Not equal")
    }


    // find the oldest person
    val people = listOf(Person("Alice ", 29), Person("Bob", 34))
    println(people.maxBy{it.age }) // searching through a collection using lambda
    println(people.minBy(Person::age))// searching using a member reference
    println(people.map{it.name})

    println(people.filter{ it.age > 34 }.map { it.name })

    //passing a lambda as named argument
    val name = people.joinToString(separator = "", transform = {p: Person -> p.name})
    println(name)

    val cub29 = people.filter { p: Person -> p.age < 29 }
}
data class User(val name:String, val id:Int)

data class Person(val name:String, val  age:Int)