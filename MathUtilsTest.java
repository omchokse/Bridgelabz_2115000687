import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            MathUtils.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    void testValidDivision() {
        assertEquals(5, MathUtils.divide(10, 2));
    }
}
