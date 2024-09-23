import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzyPrinterTest {
    @Test
    void testPrintFizzy() {
        FizzyPrinter fizzyPrinter=new FizzyPrinter();
        assertEquals("Fizz", fizzyPrinter.printFizzy(9,false));

    }
    @Test
    public void testBuzz() {
        FizzyPrinter fizzyPrinter=new FizzyPrinter();
        assertEquals("Buzz", fizzyPrinter.printFizzy(10,false));
    }
    @Test
    public void testBang() {
        FizzyPrinter fizzyPrinter=new FizzyPrinter();
        assertEquals("Bang", fizzyPrinter.printFizzy(7,false));
    }
    @Test
    public void testFizzbuzz() {
        FizzyPrinter fizzyPrinter=new FizzyPrinter();
        assertEquals("FizzBuzz", fizzyPrinter.printFizzy(15,false));
    }

    @Test
    public void testFizzbuzzbang() {
        FizzyPrinter fizzyPrinter=new FizzyPrinter();
        assertEquals("FizzBuzzBang", fizzyPrinter.printFizzy(105,false));
    }

    @Test
    public void testBoom() {
        FizzyPrinter fizzyPrinter=new FizzyPrinter();
        assertEquals("Boom", fizzyPrinter.printFizzy(2,false));
    }
    @Test
    public void testupper() {
        FizzyPrinter fizzyPrinter=new FizzyPrinter();
        assertEquals("BOOM", fizzyPrinter.printFizzy(2,true));
    }



}
