package acadamy.learningKotlinProgramming.Interface


fun main(args: Array<String>) {

    val button = Button()
    println(" Button name is ${button.name}")
    button.onTouch()
    button.onClick()

}



interface MyInterfaceListener{   // interface cannot be instantiated

    //val num:String = "Akothe" // unlike abstract class, interface cannot have non-abstract properties
   val name:String //properties cannot be initialized. They are abstract by default
    fun onTouch() // In Interface, function without body is abstract by default

    fun onClick(){   //Interface can have function that have a body but its not public final.It is open by default

        println(" You subclass!, you don't have to implement my shit")
    }

}
interface MySecondInterface{
    fun onTouch(){} //

    fun onClick(){   //Interface can have function that have a body but its not public final.It is open by default

        println(" You subclass!, you don't have to implement my shit")
    }
}
// class Button is implementing interface properties and functions
class Button:MyInterfaceListener, MySecondInterface {
    override val name: String = "button"
    override fun onTouch() {
     println(" Button was touched")
    }
    override fun onClick() {
        println(" Button was clicked ")
        super<MyInterfaceListener>.onClick() // super method calls onclick function in the interface
    }
}

// if we have two function with the same name in the interfaces and are not abstract, then we MUST override them
// if you call open functions defined in more than one interfaces into the override method, then you have to
//specify the one you mean using angle brackets <>



/**
 *
 * 1. Interface are not class by nature. They are used to provide short term or temporary services eg.
 *    when a button is clicked, something must happen.
 * 2. Everything defined in the interface body is abstract by default. hence must be override
 * 3. properties cannot be initialized when declared. same in abstract class but abstract class can have non abstract properties
 * 4. functions may or may not have a body
 * 5. Everything in interface is open/abstract by default. meaning everything must be inherited  and initialized by subclasses
 * 6. Interface can have non-abstract method but they are open by default. They are Not final
 * 7. properties must be initialized once we override them
 * 8. Unlike in abstract class, all interface functions must be override in the subclass
 *
 *
 *
 * Conclusion
 *
 * 1. Just like in abstract class, interface can have both abstract and non abstract functions. However,
 *    in abstract class, non-abstract function must be defined by open keyword in order for them to be inherited
 *    while in Interface, non-abstract method are open by default and hence no need of open keyword declaration.
 *
 *  2. unlike abstract class where you can have both abstract and non-abstract properties, interface can ONLY
 *     have abstract properties. And the are abstract by default. non need to use abstract keyword
 *
 *  3. Interfaces are Not Class.
 *
 *  Difference between a class and interface
 *
 *  1.The difference between a class and interface is that, a class describe
 *     attribute and behaviour of an object while interface contains behaviour of an object that a class must implement
 *  2. A class can be instantiated, interface CANNOT be instantiated
 *  3. A class can have constructors, interfaces does NOT contain any constructor
 *  4. A class properties are not abstract, interface properties must be abstract. cannot contain non abstract properties.
 *  5. An Interface is not extended by a class, its implemented by a class
 *  6. A class can implement multiple interfaces
 *  7. An interface can extend multiple interfaces
 *  8. A class must implement all interface behaviour, otherwise it has to declare itself as abstract.
 *
 *
 *  Properties of an interface
 *
 *  1. An interface is abstract by default.
 *  2. properties and functions are abstract by default
 *  3. An interface is just declaration of methods of an object.
 *     in, interface, we define what kind of operation an object can perform
 *
 *   use case of Interface
 *
 *   1. you expect that unrelated unrelated classes would implement your interface.
 *     for example the interfaces Comparable and Cloneable are implemented by many unrelated class
 *   2.you want to take advantage of multiple inheritance
 *
 * */

