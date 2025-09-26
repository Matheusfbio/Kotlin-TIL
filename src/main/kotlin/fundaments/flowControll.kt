package fundaments

fun main() {
 flowControl(12)
}

fun flowControl(num: Int) {
    val result = if (num % 2 == 0) "Par" else "Inpar"
    println(result)
}