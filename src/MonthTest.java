import org.junit.Test;

import static org.junit.Assert.*;


public class MonthTest {
    Month testMonth = Month.FEBRUARY;
    Month secondTestMonth = Month.DECEMBER;
    Month thirdTestMonth = Month.JANUARY;

    @Test
    public void testLength() throws Exception {
        assertTrue(testMonth.length(false) == 28);
        assertTrue(testMonth.length(true) == 29);
    }

    @Test
    public void testNextMonth() throws Exception {
        assertTrue(testMonth.nextMonth() == testMonth.MARCH);
        assertTrue(secondTestMonth.nextMonth() == testMonth.JANUARY);
    }

    @Test
    public void testPrevMonth() throws Exception {
        assertTrue(testMonth.prevMonth() == testMonth.JANUARY);
        assertTrue(thirdTestMonth.prevMonth() == testMonth.DECEMBER);
    }
}