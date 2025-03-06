package challages.variablesAndfunction

fun main() {
    val temparetureCelius = 25.0
    val temparetureFahrenheit = convertToFahrenheit(temparetureCelius)
    println(temparetureFahrenheit)
}

fun convertToFahrenheit(tempareture: Double): Double {
    return (tempareture * 9 / 5) + 32
}

