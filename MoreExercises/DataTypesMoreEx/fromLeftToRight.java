package MoreExercises.DataTypesMoreEx;

/*
You will receive a number which represents how many lines we will get as an input. On the next N lines, you will
receive a string with 2 numbers separated by a single space. You need to compare them. If the left number is greater
than the right number, you need to print the sum of all digits in the left number, otherwise print the sum of all digits
in the right number.
 */

import java.util.Scanner;

public class fromLeftToRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        long sum;
        long greaterNum;

        for (int i = 0; i < n; i++) {
            long n1 = Long.parseLong(scan.next());
            long n2 = Long.parseLong(scan.next());
            sum = 0;

            greaterNum = Math.max(n1, n2);
            while (greaterNum != 0) {
                sum += Math.abs(greaterNum % 10);
                greaterNum = Math.abs(greaterNum / 10);
            }
            System.out.println(sum);
        }
    }
}
