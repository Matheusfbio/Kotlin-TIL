import challages.variablesAndfunction.convertToFahrenheit
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VariableAndFunction {
    @Test
    fun `Should be the tempareture in fahrenheit`() {
        val result = convertToFahrenheit(25.0)
        assertEquals(77.0, result)
    }
}