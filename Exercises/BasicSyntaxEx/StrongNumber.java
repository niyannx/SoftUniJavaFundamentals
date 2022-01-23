package Exercises.BasicSyntaxEx;

/*
Write a program to check if a given number is a strong number or not. A number is strong if the sum of the Factorial
of each digit is equal to the number. For example 145 is a strong number, because 1! + 4! + 5! = 145. Print &quot;yes&quot; if
the number is strong and &quot;no&quot; if the number is not strong.
 */

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int fact = 1;

        String number = String.valueOf(num);
        char[] digits = number.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            int digit = Integer.parseInt(String.valueOf(digits[i]));

            for (int j = 1; j <= digit; j++) {
                fact = fact * j;
            }
            sum = sum + fact;
            fact = 1;
        }
        if (sum == num) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
