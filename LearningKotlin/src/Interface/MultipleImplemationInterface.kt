package Interface



interface MyInterface1{
    fun doSomething()
}
interface MyInterface2{
    fun absMethod()
}
// multiple implementation
class MultipleImplemationInterface: MyInterface1,MyInterface2{
    override fun doSomething() {
        println("Overriding doSomething of MyInterface1")
    }

    override fun absMethod() {
        println("Overriding absMethod() of MyInterface2")
    }
}

fun main(args: Array<String>) {
    val obj = MultipleImplemationInterface()
    obj.doSomething()
    obj.doSomething()
}