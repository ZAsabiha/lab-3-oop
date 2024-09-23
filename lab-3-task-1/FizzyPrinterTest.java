import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzyPrinterTest {

    FizzyPrinter fizzyPrinter = new FizzyPrinter();

    @Test
    public void testFizz() {
        assertEquals("Fizz", fizzyPrinter.printFizzy(9, false), "Should return Fizz for multiples of 3");
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", fizzyPrinter.printFizzy(10, false), "Should return Buzz for multiples of 5");
    }

    @Test
    public void testBang() {
        assertEquals("Bang", fizzyPrinter.printFizzy(7, false), "Should return Bang for multiples of 7");
    }

    @Test
    public void testFizzbuzz() {
        assertEquals("FizzBuzz", fizzyPrinter.printFizzy(15, false), "Should return FizzBuzz for multiples of 3 and 5");
    }

    @Test
    public void testFizzbuzzbang() {
        assertEquals("FizzBuzzBang", fizzyPrinter.printFizzy(105, false), "Should return FizzBuzzBang for multiples of 3, 5, and 7");
    }

    @Test
    public void testBoom() {
        assertEquals("Boom", fizzyPrinter.printFizzy(2, false), "Should return Boom for non-divisible numbers");
    }

    @Test
    public void testUppercase() {
        assertEquals("FIZZBUZZBANG", fizzyPrinter.printFizzy(105, true), "Should return FIZZBUZZBANG in uppercase if requested");
    }
}
