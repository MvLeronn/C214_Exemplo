package org.example;
import org.apache.commons.lang3.StringUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Exemplo 1: Inverter uma string
        String original = "Hello, World!";
        String reversed = StringUtils.reverse(original);
        System.out.println("String invertida: " + reversed);

        // Exemplo 2: Verificar se uma string é vazia
        String emptyString = "";
        if (StringUtils.isEmpty(emptyString)) {
            System.out.println("A string está vazia.");
        } else {
            System.out.println("A string não está vazia.");
        }

        // Exemplo 3: Dividir uma string em partes
        String sentence = "Apache Commons Lang is useful";
        String[] words = StringUtils.split(sentence, ' ');
        System.out.println("Palavras na frase:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}