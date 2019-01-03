package ClassAndObject


fun main(args: Array<String>) {

   val arrayList = ArrayList<Books>()
    arrayList.add(Books("java", "francis", "Longhorn",3))
    arrayList.add(Books("Database","Susan","Longhorn",4 ))

    println("**********Looping through the item inside the ArrayList")
    for (book in arrayList){
        println(" Book Name: "+book.name+"\n"+" Book Author: "+book.author+"\n"+" Book Publisher: "+book.publisher+"\n"+" Book Quantity: "+book.quantity)
    }

}
class Books(var name: String="", var author: String="", var publisher: String="", var quantity: Int=0)
