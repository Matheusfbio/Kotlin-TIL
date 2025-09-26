package controle_fluxo

fun main() {
    conditions()
//    val vehicle = "moto"
// Usando if
//    if (vehicle === "carro") {
//        println("voce escolhei o carro")
//    } else {
//        if (vehicle === "moto") {
//            println("voce escolhei o moto")
//        } else {
//            println("voce escolhei o bike")
//        }
//    }
//    when(vehicle) {
//        "bike" -> println("voce escolhei o bike")
//        "moto" -> println("voce escolhei o moto")
//        "carro" -> println("voce escolhei o carro")
//        else -> println("tipo de veiculo não cadastrado")
//    }
}

private fun conditions() {
    val trafficLightColor = "Black"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else if (trafficLightColor == "Green") {
        println("Go")
    } else {
        println("Invalid traffic-light color")
    }
}