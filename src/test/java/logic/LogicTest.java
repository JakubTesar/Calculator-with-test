package logic;

import junit.framework.TestCase;

public class LogicTest extends TestCase {
    Logic logic = new Logic();

    public void testPlus() {
        int a = 5;
        int b = 6;

        assertEquals(11, logic.plus(a,b));
    }

    public void testMinus() {
        int a = 3;
        int b = 2;

        assertEquals(1, logic.minus(a,b));
    }

    public void testTimes() {
        int a = 3;
        int b = 2;
        assertEquals(6, logic.times(a,b));
    }

    public void testDivided() {
        int a = 2;
        int b = 2;
        assertEquals(1, logic.divided(a,b));
    }

    public void testPower() {
        int a = 3;
        int b = 2;

        assertEquals(9, logic.power(a,b));
    }

    public void testFactorial() {
        int a = 5;

        assertEquals(120, logic.factorial(a));
    }
}