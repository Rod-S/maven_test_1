import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTestLec {

    @Test
    public void testIfNamesAreEqual(){
        String name1 = "jane";
        String name2 = "jane";
        String name3 = "john";
        String name4 = "john";

        assertEquals(name1, name2);
        assertEquals(name3, name4);
    }

    @Test
    public void testIfNumbersAreEqual(){
        int myNumber = 5;
        int userInput = 5;

        assertEquals(myNumber, userInput);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price-discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonedSheep);
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J', 'u','n', 'i', 't'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks(){
        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    @Test
    public void testIfInstanceIsNull() {
        Object phone = new Object();
        Object laptop = null;
        assertNull(null);
        assertNotNull(phone);
        assertNull(laptop);
    }
}
