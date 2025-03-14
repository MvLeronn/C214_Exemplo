package org.example;
import org.apache.commons.lang3.StringUtils;

public class StringManipulation {

    // Inverte uma string
    public String reverseString(String input) {
        if(input == null)
            throw new IllegalArgumentException("Input cannot be null");
        return StringUtils.reverse(input);
    }

    // Verifica se a string é vazia
    public boolean isEmptyString(String input) {
        if(input == null)
            throw new IllegalArgumentException("Input cannot be null");
        return StringUtils.isEmpty(input);
    }

    // dividi a string em palavras (com base no espaço)
    public String[] splitStringIntoWords(String input) {
        if(input == null)
            throw new IllegalArgumentException("Input cannot be null");
        return StringUtils.split(input, ' ');
    }

    // substitui espaços por hífens
    public String replaceSpacesWithHyphens(String input) {
        if(input == null)
            throw new IllegalArgumentException("Input cannot be null");
        return StringUtils.replaceChars(input, ' ', '-');
    }

}
