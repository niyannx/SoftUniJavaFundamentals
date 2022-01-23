package Labs.DataTypesLab;

/*
A number is special when its sum of digits is 5, 7 or 11.
Write a program to read an integer n and for all numbers in the range 1…n to print the number and if it is
special or not (True / False).
 */

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum;
        String state;

        for (int i = 1; i <= n; i++) {
            String number = String.valueOf(i);
            char[] digits = number.toCharArray();

            sum = 0;

            for (int j = 0; j < number.length(); j++) {
                sum += Integer.parseInt(String.valueOf(digits[j]));
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                state = "True";
            } else {
                state = "False";
            }

            System.out.printf("%d -> %s\n", i, state);
        }
    }
}
