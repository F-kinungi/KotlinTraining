package ClassAndObject

class MyClass(val name:String, var id:Int)

fun main(args: Array<String>) {

    var obj = MyClass("Francis", 12)
    println(" ${obj.name}  ")
    println(obj.id)

    MyClass2("Monica", 28)
}

class MyClass2(name: String, id: Int){

    val e_name: String
    var e_id: Int

    init {
        e_name = name
        e_id = id
        println("name = $e_name \n id = $e_id")
       // println("id = $e_id")
    }

}