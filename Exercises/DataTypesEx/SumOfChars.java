package Exercises.DataTypesEx;

/*
Write a program, which sums the ASCII codes of n characters.
Print the sum on the console.
 */

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            char ch = scan.next().charAt(0);
            sum += ch;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
