package acadamy.learningKotlinProgramming.ListCollection

import kotlin.test.assertEquals


fun main(args: Array<String>) {

    println(" \n ******************** let see the list collection in kotlin")


        val list = listOf<String>("Caro","null","Janet","Esther","null","Helen","Leah", "Esther", "Joan","Grace", "Maggie")

         for (friendsName in list) {
            println(friendsName)
           friendsName.drop(2)
          //assertEquals(,friendsName)
           // println("what is the result after dropping the items ")
            println(friendsName)
    }

}


