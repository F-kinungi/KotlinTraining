package acadamy.learningKotlinProgramming.HigherOrderFunction


fun main(args: Array<String>) {
    val person = Person()
    //println("My name is ${person.name} and I am ${person.age} years old ")

    // we can use with keyword and lambda expression
    with(person) {
        this.name
        this.age
    }
    println("My name is ${person.name} and I am ${person.age} years old ")

    // we can also use apply keyword and lambda expression
    person.apply {
        this.name
        this.age
    }.info()
    println("My name is ${person.name} and I am ${person.age} years old ")

}

class Person{
    val name:String = "Shakira"
    val  age:Int = 45
    fun info() {

    }
}
