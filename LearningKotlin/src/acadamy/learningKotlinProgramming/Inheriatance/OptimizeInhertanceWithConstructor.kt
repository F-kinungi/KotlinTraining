package acadamy.learningKotlinProgramming.Inheriatance


fun main(args: Array<String>) {
    val dog2 = Dog2("brown","German Shepherd" )
    dog2.eat()
}
open class Animal2  {
  /*  init {
        println("The color of animal is $color")
    }*/
    // let now work with secondary constructor
    var color:String = ""
    constructor(color: String){
        this.color = color
        println("The color of animal is $color")
    }
    open fun eat() {
        println("The black animal is eating the fresh grass")
    }
}
class Dog2:Animal2{
  /*  init {
        println("The dog color is: ${color.toUpperCase()} and its breed is: ${breed.toUpperCase()}")
    }*/
    var breed:String = ""
    constructor(color: String, breed: String):super(color){
      this.breed = breed
        println("The dog color is: ${color.toUpperCase()} and its breed is: ${breed.toUpperCase()}")
  }
   override  fun eat(){
       super.eat() //calling super class method inside override function
    println("The fat brown dog is eating the small innocent emaciated puppy")
    }
}