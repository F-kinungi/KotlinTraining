package acadamy.learningKotlinProgramming

class Lamp {
    //private data
    private  var isOn: Boolean = true

// member function
    fun turnOn() {
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }
    fun displayLightStatus() {
        if (isOn)
            println("Lamp is on")
        else
            println("lamp is off")
    }
}
fun main(args: Array<String>) {

    val lamp1 = Lamp()

    lamp1.turnOn()
    lamp1.turnOff()
    lamp1.displayLightStatus()


}