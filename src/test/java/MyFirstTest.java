import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class MyFirstTest {

    @Test
    public void testifStringsEqual() {
        String str1 = "Codeup";
        String str2 = "CodeUp";

        assertEquals(str1, str2);
    }

    @Test
    public void testIfArraysSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testIfArraysEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfContains() {
        String language = "PHP";
            assertTrue(language.contains("H"));
            assertFalse(language.contains("J"));
    }

}
