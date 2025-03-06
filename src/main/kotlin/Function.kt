fun main() {
    println(showNameUser(age = 12))
    println(showNameUser(name = "luiz", age =  34))
}

fun showNameUser(name: String = "Zé", age: Int): String {
//    val name = "Name: $name"
//    val age = "Age: $age"
    return "$name $age"

}