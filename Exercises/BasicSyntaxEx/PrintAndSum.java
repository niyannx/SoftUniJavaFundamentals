package Exercises.BasicSyntaxEx;

/*
Write a program to display numbers from given start to given end and their sum. All the numbers will be integers.
On the first line you will receive the start number, on the second the end number.
 */

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = a; i <= b; i++) {
            System.out.printf("%d ", i);
            sum = sum + i;
        }
        System.out.printf("\nSum: %d", sum);
    }
}
