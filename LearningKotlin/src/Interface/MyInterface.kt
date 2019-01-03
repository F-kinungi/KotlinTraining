package Interface

interface MyInterface {

    var  id: Int  //abstract property

    fun absMethod():String // abstract method

    fun doSomething(){
        println("My interface is doing something ")
    }
}
class InterfaceImp:MyInterface{
    override var id: Int = 100

    override fun absMethod(): String {
        return "Implementing abstract method"
    }

}

fun main(args: Array<String>) {
    val obj = InterfaceImp()
    println("calling override abstract property ${obj.id}")
    println("*************calling non-abstract method")
    println("${obj.doSomething()}")
    println("*************calling abstract method")

    println("${obj.absMethod()}")




}