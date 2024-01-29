import org.example.SerieFibonacci;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class FibonacciTest {
    @Test
    public void Fibonacci (){
        assertEquals(0, SerieFibonacci.FibonacciSerie(0));
        assertEquals(2, SerieFibonacci.FibonacciSerie(3));
        assertEquals(3, SerieFibonacci.FibonacciSerie(4));
        assertEquals(5, SerieFibonacci.FibonacciSerie(5));
    }
    @Test
    public void testPrimeNumber() {
            assertTrue(SerieFibonacci.PrimeNumber(2));
            assertTrue(SerieFibonacci.PrimeNumber(3));
            assertFalse(SerieFibonacci.PrimeNumber(4));
            assertTrue(SerieFibonacci.PrimeNumber(5));
            assertFalse(SerieFibonacci.PrimeNumber(6));
    }
}
