package acadamy.learningKotlinProgramming.Interface


fun main(args: Array<String>) {
    val car = Car()
    car.changeGear(3)
    car.speedUp(80)
    car.applyBrakes(1)
    car.printCarState()
}

interface Vehicle {
    fun changeGear(newValue:Int)
    fun speedUp(increment:Int)
    fun applyBrakes(decrement:Int)
}
class Car: Vehicle{
     var speed:Int = 0
     var gear:Int = -1
    override fun changeGear(newValue: Int) {
        this.gear = newValue
    }
    override fun speedUp(increment: Int) {
        this.speed = speed + increment
    }
    override fun applyBrakes(decrement: Int) {
        this.speed = speed - decrement
    }
    fun printCarState(){
        println("speed: $speed \n gear: $gear")
    }

}