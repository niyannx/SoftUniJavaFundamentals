package Exercises.MethodsEx;

/*
A palindrome is a number which reads the same backward as forward, such as 323 or 1001. Write a program which
reads a positive integer numbers until you receive &quot;END&quot;. For each number print whether the number is palindrome
or not.
 */

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        while (!input.equals("END")) {
            int n = Integer.parseInt(input);
            System.out.println(checkPalindrome(n));
            input = scan.nextLine();
        }
    }

    public static boolean checkPalindrome(int n) {
        int remain, temp = n, sum = 0;

        while (n > 0) {
            remain = n % 10;
            sum = (sum * 10) + remain;
            n = n / 10;
        }
        return temp == sum;
    }
}
