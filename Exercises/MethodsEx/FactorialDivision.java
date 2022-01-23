package Exercises.MethodsEx;

/*
Read two integer numbers. Calculate factorial of each number. Divide the first result by the second and print the
division formatted to the second decimal point.
 */

import java.util.Scanner;

public class FactorialDivision {
    private static long factorialOf(int n) {
        long factorial = 1;

        for (int i = n; i >= 2; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());

        System.out.printf("%.2f", (double)factorialOf(n1) / factorialOf(n2));
    }
}
