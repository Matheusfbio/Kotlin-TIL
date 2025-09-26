package class_and_object

class SmartDevice {

    val name = "android tv"
    val category = "Entertainment"
    var deviceStatus = "online"

    var speakerVolume = 102
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun turnOn() {
        println("Device is turned on")
    }

    fun turnOff() {
        println("Smart device is turned off")
    }
}

fun main() {
    val smartTv = SmartDevice()
    smartTv.speakerVolume = 32
    println("Device name is: ${smartTv.name}")
    println(smartTv.speakerVolume)

    smartTv.speakerVolume = 100
    println(smartTv.speakerVolume)
    smartTv.turnOn()
    smartTv.turnOff()
}