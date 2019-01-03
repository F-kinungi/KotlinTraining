package acadamy.learningKotlinProgramming

open class Animal
class Cat: Animal() {
    fun meow(){
        println("meow meow meow")
    }
}
class Dog: Animal() {
    fun bark(){
        println("gu gu gu gu!")
    }
}
fun main(args: Array<String>) {
    // smart casting
    val animal: Animal = Cat()
    val animal2: Animal = Dog()
    if (animal is Cat) {
        println(animal.meow())
    } else if (animal2 is Dog) {
        println(animal2.bark())
    }
}