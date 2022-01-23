package Exercises.MethodsEx;

/*
Read an integer n from the console. Find all top numbers in the range [1 … n] and print them. A top number holds
the following properties:
 Its sum of digits is divisible by 8, e.g. 8, 16, 88.
 Holds at least one odd digit, e.g. 232, 707, 87578.
 */

import java.util.Scanner;

public class TopNumber {
    public static int sumOfDigits(int num) {
        int digit;
        int sum = 0;

        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

    private static boolean isTopNumber(int num) {
        int sum = sumOfDigits(num);

        if (sum % 8 == 0) {
            int currDigit;
            while (num > 0) {
                currDigit = num % 10;
                if (currDigit % 2 != 0) {
                    return true;
                }
                num = num / 10;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            if (isTopNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
