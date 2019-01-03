package ClassAndObject

class OuterInner {

    private var name:String = "Francis"

    //Inner class cannot be declared inside interfaces or non-inner nested class
    inner class InnerClass{
       var description: String = "code to be execuuted "
        private var id:Int = 102

        fun foo(){

            println(name)// accessing the outer class member even the private
            println(id)
        }
    }
}

fun main(args: Array<String>) {
    println(OuterInner().InnerClass().description) // accessing property of inner class
    println(OuterInner().InnerClass().foo()) // accessing innerclass function without object

   // var obj = OuterInner().InnerClass()
   // obj.foo() // accessing member function
}


/***
 * The advantage of inner class over nested class is that, it is able to access members
 * of outer class even its private. Inner class keep reference of outer class
 *
 * */

