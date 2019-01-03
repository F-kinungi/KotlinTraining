package ClassAndObject

class Account {
    var acc_no:Int = 0
    var name:String = ""
    var amount:Float =0f

    fun insert(acc:Int, n:String,am:Float){

        acc_no = acc
        name = n
        amount = am

        println(" Account no: $acc_no \n Account holder: $name  \n Account amount $amount")
    }

}

fun main(args: Array<String>) {

    var acc = Account() // creating object of Account class
    acc.insert(2345623, "Awit",5000f) // accessing member function
   // println(acc.name) // accessing class property
}