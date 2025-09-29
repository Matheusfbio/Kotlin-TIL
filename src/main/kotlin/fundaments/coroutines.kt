package fundaments

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(4000L)
        println("After 4 second")
    }
        println("Started")
}