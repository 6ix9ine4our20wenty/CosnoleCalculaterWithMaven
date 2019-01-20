import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CalculatorTest{
    Calculator testee;
        /*
    Addition
        */
    @Test
    public void testSummePositive() {
        testee = new Calculator();
        assertTrue(testee.summe(10, 20) == 30);
    }
    @Test
    public void testSummeNegative() {
        testee = new Calculator();
        assertTrue(testee.summe(-20, -10) == -30);
    }
    @Test
    public void testSummePositiveNegative() {
        testee = new Calculator();
        assertTrue(testee.summe(-10, 20) == 10);
    }
    @Test
    public void testSummeNegativePositive() {
        testee = new Calculator();
        assertTrue(testee.summe(10, -20) == -10);
    }
    @Test
    public void testSummeZero() {
        testee = new Calculator();
        assertTrue(testee.summe(0, 20) == 20);
    }
    @Test
    public void testSummeRounding() {
        testee = new Calculator();
        assertTrue(testee.summe(5 / 2, 2) == 4);
    }
    @Test
    public void testSummeLargenumbers() {
        testee = new Calculator();
        assertTrue(testee.summe(1000000, 2000000) == 3000000);
    }
    @Test(expected = ArithmeticException.class)
    public void testSummeOverflow() {
       testee = new Calculator();
        assertEquals((long) Integer.MAX_VALUE + 1, testee.summe(Integer.MAX_VALUE, 1));
    }
        /*
    Subtraktion
        */

        @Test
    public void TestDifferenz(){
            testee = new Calculator();
            assertTrue(testee.differenz(2, 1) == 2);
        }

}