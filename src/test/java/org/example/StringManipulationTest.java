package org.example;

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
        assertEquals(expected, result, "A string invertida não está correta.");
    }

    // Testa o isEmptyString
    @Test
    public void testIsEmptyString() {
        StringManipulation sm = new StringManipulation();

        String emptyInput = "";
        String nonEmptyInput = "Hello";

        assertTrue(sm.isEmptyString(emptyInput), "A string vazia não foi reconhecida.");
        assertFalse(sm.isEmptyString(nonEmptyInput), "A string não vazia foi reconhecida como vazia.");
    }

    // Testa o  splitStringIntoWords
    @Test
    public void testSplitStringIntoWords() {
        StringManipulation sm = new StringManipulation();
        String input = "Hello Apache Commons Lang";
        String[] expected = {"Hello", "Apache", "Commons", "Lang"};

        String[] result = sm.splitStringIntoWords(input);
        assertArrayEquals(expected, result, "A divisão da string em palavras não está correta.");
    }

    // Testa o replaceSpacesWithHyphens
    @Test
    public void testReplaceSpacesWithHyphens() {
        StringManipulation sm = new StringManipulation();
        String input = "Hello Apache Commons Lang";
        String expected = "Hello-Apache-Commons-Lang";
        String result = sm.replaceSpacesWithHyphens(input);
        assertEquals(expected, result, "Os espaços não foram corretamente substituídos por hífens.");
    }
}
