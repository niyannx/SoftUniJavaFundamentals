package Exercises.AssociativeArraysEx;

/*
Write a program, which counts all characters in a string except space (&#39; &#39;).
Print all occurrences in the following format:
{char} -> {occurrences}
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap <Character, Integer> occurrences = new LinkedHashMap<>();

        // remove spaces
        String[] input = scan.nextLine().split(" ");

        // iterate through words
        for (String s : input) {
            // split current word into seperated letters
            char[] wordToChars = s.toCharArray();

            // iterate through each letter of the word
            for (char wordToChar : wordToChars) {
                // if the hashmap contains the letter, add 1 to the count
                if (occurrences.containsKey(wordToChar)) {
                    occurrences.put(wordToChar, occurrences.get(wordToChar) + 1);
                } else {
                    // if the hashmap does not contain the letter, add it with count 1
                    occurrences.put(wordToChar, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.printf("%c -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
