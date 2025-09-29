package fundaments

data class Car(val brand: String, val model: String, val age: Int)

fun main (){
    println(validateCar(Car("Hilux", "Toyota", 10)))
//    val car1 = Car("Hilux", "Toyota", 10)
//    println()
}
fun validateCar(car: Car) {
    val (brand, model, age) = car
    val validate = if (age >= 3) "Marca: ${brand}\ndo modelo: $model\nCom idade de $age\nclassificado com: Carro velho" else "Marca: ${brand}\nmodelo: $model\nidade de $age\nclassificado com: Carro novo"
    println(validate)
    return
}
