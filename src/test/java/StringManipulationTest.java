import org.example.StringManipulation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulationTest {

    // Testa o reverseString
    @Test
    public void testReverseString() {
        StringManipulation sm = new StringManipulation();
        String input = "Hello";
        String expected = "olleH";
        String result = sm.reverseString(input);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseString2(){
        StringManipulation sm = new StringManipulation();
        String input = "Marcos";
        String expected = "socraM";
        String result = sm.reverseString(input);
        assertEquals(expected, result);
    }

    // Testa o isEmptyString
    @Test
    public void testIsEmptyString() {
        StringManipulation sm = new StringManipulation();

        String emptyInput = "";
        String nonEmptyInput = "Hello";

        assertTrue(sm.isEmptyString(emptyInput));
        assertFalse(sm.isEmptyString(nonEmptyInput));
    }

    // Testa o  splitStringIntoWords
    @Test
    public void testSplitStringIntoWords() {
        StringManipulation sm = new StringManipulation();
        String input = "Hello Apache Commons Lang";
        String[] expected = {"Hello", "Apache", "Commons", "Lang"};

        String[] result = sm.splitStringIntoWords(input);
        assertArrayEquals(expected, result);
    }

    // Testa o replaceSpacesWithHyphens
    @Test
    public void testReplaceSpacesWithHyphens() {
        StringManipulation sm = new StringManipulation();
        String input = "Hello Apache Commons Lang";
        String expected = "Hello-Apache-Commons-Lang";
        String result = sm.replaceSpacesWithHyphens(input);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseInputNull() {
        StringManipulation sm = new StringManipulation();
        String input = null;
        //String result = sm.reverseString(input);
        assertThrows(IllegalArgumentException.class, () -> sm.reverseString(input));
    }

    @Test
    public void testIsEmptyStringWithSpaces() {
        StringManipulation sm = new StringManipulation();
        String input = " ";
        assertFalse(sm.isEmptyString(input));
    }

    @Test
    public void testSplitStringIntoWordsWithNull() {
        StringManipulation sm = new StringManipulation();
        String input = null;
        assertThrows(IllegalArgumentException.class, () -> sm.splitStringIntoWords(input));
    }

    @Test
    public void testSplitStringIntoWordsWithEmptyString() {
        StringManipulation sm = new StringManipulation();
        String input = "";
        String[] expected = {};
        String[] result = sm.splitStringIntoWords(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testReplaceSpacesWithHyphensWithEmptyString() {
        StringManipulation sm = new StringManipulation();
        String input = "";
        String expected = "";
        String result = sm.replaceSpacesWithHyphens(input);
        assertEquals(expected, result);
    }

}
