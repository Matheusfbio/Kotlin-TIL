package challages.kotlinBasic

fun main() {
    val steps = 4000
    val caloriesBurned = pedometersStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}
// This function are to use the camelCase on function
fun pedometersStepsToCalories(numberOfStepS: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfStepS * caloriesBurnedForEachStep
    return totalCaloriesBurned
}