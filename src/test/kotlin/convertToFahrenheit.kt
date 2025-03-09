import challages.variablesAndfunction.convertToFahrenheit
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class VariableAndFunction {

    @Test
    fun `Should be the tempareture in fahrenheit`() {
        val result = convertToFahrenheit(25.0)
        assertEquals(77.0, result)
    }

    @Test
    fun `Should be to show error about the double input value` () {
        assertThrows<ArithmeticException> {  }
    }
}