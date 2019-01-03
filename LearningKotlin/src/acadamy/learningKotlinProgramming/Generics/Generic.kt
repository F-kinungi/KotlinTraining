package acadamy.learningKotlinProgramming.Generics


//example without using generic

class Person(age:Int) {
    var age:Int = 20
    init {
        this.age = age
    }
}

// example with generic
// Generic types are very important because they allow developers to
class Person3<T>(age: T){
    var age:T = age
    init {
        this.age = age
    }

}

fun main(args: Array<String>) {
    val person = Person(30)
    println("My real age is: ${person.age}")

    //var person2 = Person("40")//compile time error. we can solve the error by using generic type

    // generic class
    val person3: Person3<Int> = Person3<Int>(31)
    println("My Real age is: ${person3.age}")
    val girlfriend: Person3<String> = Person3<String>("47")
    println("My girlfiednd age is: ${girlfriend.age}")
}