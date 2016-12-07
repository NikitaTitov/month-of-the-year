import org.junit.Test;

import static org.junit.Assert.*;


public class MonthTest {
    Month testMonth = Month.FEBRUARY;

    @Test
    public void testLength() throws Exception {
        assertTrue(testMonth.length(false) == 28);
        assertTrue(testMonth.length(true) == 29);
    }

    @Test
    public void testNextMonth() throws Exception {
        assertTrue(testMonth.nextMonth() == testMonth.MARCH);
    }
}