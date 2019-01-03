package acadamy.learningKotlinProgramming.Abstraction


fun main(args: Array<String>) {

    val indian = Indian("Akothe")
    indian.num

    //bank abstract class
    val sbk = SBK()
    val yearRate = sbk.simpeInterest(1000000, 13.0, 12)
    println("SBK bank interest rate yearly : $yearRate")

    val pnb = PNB()
    pnb.simpeInterest(1000,10.0,12)
    println("PNB bank interest rate yearly : $yearRate")



}
abstract class Person(val num: String ) {  // we cannot create instance of abstract class
     //non-abstract properties can be initialized
    abstract val name:String // abstract property cannot be initialized
    abstract fun eat()       // abstract function cannot have a body
    open fun height(){}      // open function must have a body and not a must to override
    fun goToSchool() {}      // abstract class may also have normal function, tho useless
}

class Indian(num: String, id:Int = 2):Person(num){
    init {
        println("Her name is: $num and her id is : $id")
    }

    override val name: String ="Dummy_Indian"
    override  fun eat(){
    }
    override fun height() {
    }
}

// bank example
abstract class Bank{

    abstract fun simpeInterest(principle:Int, rate:Double, period: Int):Double
}
class SBK:Bank(){
    override fun simpeInterest(principle: Int, rate: Double, period: Int):Double {
        return(principle*rate*period)/100
    }
}
class PNB:Bank(){
    override fun simpeInterest(principle: Int, rate: Double, period: Int):Double {
        return(principle*rate*period)/100

    }

}

/**
 *   Abstract class is open by default. Meaning that you do not need open keyword to perform inheritance
 *   Abstract class may have non-abstract functions and its option to override them
 *   Abstract properties and functions are open by default. but they must start with a abstract keyword
 *   Abstract function must not have a body declaration
 *
 *   All properties and functions declared with abstract keyword must be override by subclasses
 *   Once you override properties and functions, you must initialize properties with value and functions with body
 *
 *   abstract property cannot be initialized
 *
 *   we cannot create instance of abstract class
 *
 *
 *   Role of abstract class
 *
 *   1. The role of abstract class is just to provide set of properties and functions
 *   2. Abstract class is partially defined class
 *   3. Abstract functions have no body when declared
 *   4. Abstract properties cannot be initialized when declared
 *   5. Unlike interfaces, abstract class can have constructors
 *   6. Abstract method can be either parameterized or non parameterized
 * */