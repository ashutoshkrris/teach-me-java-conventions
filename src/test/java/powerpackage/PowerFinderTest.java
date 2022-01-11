package powerpackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerFinderTest {

    @Test
    public void testOneRaisedToOne() {
        assertEquals(1, PowerFinder.calculatePower(1, 1));
    }

    @Test
    public void testTwoRaisedToOne() {
        assertEquals(2, PowerFinder.calculatePower(2, 1));
    }

    @Test
    public void testTwoRaisedToTwo() {
        assertEquals(4, PowerFinder.calculatePower(2, 2));
    }

    @Test
    public void testThreeRaisedToTwo() {
        assertEquals(9, PowerFinder.calculatePower(3, 2));
    }
}
