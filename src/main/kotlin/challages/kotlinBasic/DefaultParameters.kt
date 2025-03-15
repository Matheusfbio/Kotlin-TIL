package challages.kotlinBasic

fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

// Define your displayAlertMessage() below this line.

//fun displayAlertMessage(param1: String, param2: String): String {
//    return("There's a new sign-in request on $param1 for your Google Account $param2.\n")
//}

fun displayAlertMessage(operationUserSystem: String = "Unknown OS", emailId: String): String {
    return("There's a new sign-in request on $operationUserSystem for your Google Account $emailId.\n")
}