package Exercises.DataTypesEx;

/*
You will be given a single integer. Your task is to find the sum of its digits.
 */

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            String number = String.valueOf(i);
            char[] digits = number.toCharArray();

            sum = 0;

            for (int j = 0; j < number.length(); j++) {
                sum += Integer.parseInt(String.valueOf(digits[j]));
            }
        }
        System.out.println(sum);
    }
}
