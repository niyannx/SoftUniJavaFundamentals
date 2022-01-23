package MoreExercises.ArraysMoreEx;

/*
Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
 The code of each vowel multiplied by the string length
 The code of each consonant divided by the string length
Sort the number sequence in ascending order and print it on the console.
On first line, you will always receive the number of strings you have to read.
 */

import java.util.Arrays;
import java.util.Scanner;

public class encryptSortPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] encrypted = new int[n];

        int sum = 0;

        // ENCRYPT
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();

            for (int j = 0; j < input.length(); j++) {
                if (isVowel(input.charAt(j))) {
                    sum += input.charAt(j) * input.length();
                } else {
                    sum += input.charAt(j) / input.length();
                }
            }
            encrypted[i] = sum;
            sum = 0;
        }

        // SORT
        Arrays.sort(encrypted);

        // PRINT
        for (int i = 0; i < n; i++) {
            System.out.println(encrypted[i]);
        }
    }

    // boolean - is char a vowel
    public static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(c + "");
    }
}
