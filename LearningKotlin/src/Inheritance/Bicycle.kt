package Inheritance

 open class Bicycle {

     var gear: Int =0
     var speed: Int =0
    constructor(gear: Int, speed: Int){
        this.gear = gear
        this.speed = speed
    }
     // bicycle has three methods
    open fun applyBrake(decrement: Int){
         speed -= decrement
     }
    open fun  speedUp(increment:Int){
         speed += increment
     }
     override fun toString(): String {
      return("No of gears are "+ gear+"\n"+"Speed of bicycle is "+speed)
     }
 }
class MountainBike : Bicycle{

    var seatHeight: Int = 0

    constructor(gear: Int,speed: Int, seatHeight: Int):super(gear, speed){

    }
    fun setHeight(newValue: Int){
        seatHeight = newValue
    }

    override fun applyBrake(decrement: Int) {
        println("please break down the speed")
    }

    override fun speedUp(increment: Int) {
        println("Please speed up to 80km")
    }

    override fun toString(): String {
        return (super.toString()+"\nseat height $seatHeight")
    }
}

fun main(args: Array<String>) {
    val obj = MountainBike(4,78,4)
    println(obj.toString())

}