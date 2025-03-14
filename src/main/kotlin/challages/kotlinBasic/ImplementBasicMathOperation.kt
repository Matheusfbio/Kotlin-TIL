package challages.kotlinBasic
//Step 1
//fun main() {
//    val firstNumber = 10
//    val secondNumber = 5
//    val result = firstNumber + secondNumber
//    println("$firstNumber + $secondNumber = $result")
//}

//Step 2
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    val result2 = subtract(firstNumber, secondNumber)
    val anotherResult2 = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$firstNumber + $secondNumber = $result2")
    println("$firstNumber + $thirdNumber = $anotherResult2")
}

// Define add() function below this line
fun add(vararg number:Int):Int {
    return number.sum()
}
// Define add() function below this line
fun subtract(vararg number:Int):Int {
    return number.reduce {acc, num -> acc - num}
}