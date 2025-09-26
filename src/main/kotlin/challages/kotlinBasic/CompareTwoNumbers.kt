package challages.kotlinBasic

fun main(){
    counterScreen(555,555)
}

fun counterScreen(timeSpentToday: Int, timeSpentYesterday: Int): Boolean  {
    if (timeSpentToday > timeSpentYesterday) {
        println("$timeSpentToday is more high than $timeSpentYesterday")
        return true
    } else if (timeSpentYesterday > timeSpentToday) {
        println("$timeSpentYesterday is more high $timeSpentToday")
        return false
    } else {
        println("both are equals")
       return false
    }
}