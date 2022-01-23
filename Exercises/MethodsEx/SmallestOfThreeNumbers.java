package Exercises.MethodsEx;

/*
Write a method to print the smallest of three integer numbers. Use appropriate name for the method.
 */

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int n3 = Integer.parseInt(scan.nextLine());

        System.out.println(smallestOf(n1, n2, n3));
    }

    private static int smallestOf(int n1, int n2, int n3) {
        if (n1 < n2) {
            return Math.min(n3, n1);
        } else {
            return Math.min(n2, n3);
        }
    }
}
