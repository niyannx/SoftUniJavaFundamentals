package Exercises.MethodsEx;

/*
Write a method that receives two characters and prints on a single line all the characters in between them according
to ASCII.
 */

import java.util.Scanner;

public class CharsInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char start = scan.nextLine().charAt(0);
        char end = scan.nextLine().charAt(0);

        inRange(start, end);
    }

    private static void inRange(char first, char second) {
        int start = Math.min(first, second);
        int end = Math.max(first, second);

        for (char i = (char)++start; i < end; i++) {
            System.out.printf("%c ", i);
        }
    }
}
