package Labs.BasicSyntaxLab;

/*
Write a program that prints the next n odd numbers (starting from 1) and on the last row prints the sum of them.
 */

import java.util.Scanner;

public class SumOfOddNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int counter = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                counter++;
                sum = sum + i;
                System.out.println(i);
            }
            if (counter == n) {
                break;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
