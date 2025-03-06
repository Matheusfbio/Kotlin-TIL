package controle_fluxo

fun main() {
    val vehicle = "moto"
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

    when(vehicle) {
        "bike" -> println("voce escolhei o bike")
        "moto" -> println("voce escolhei o moto")
        "carro" -> println("voce escolhei o carro")
        else -> println("tipo de veiculo não cadastrado")
    }


}