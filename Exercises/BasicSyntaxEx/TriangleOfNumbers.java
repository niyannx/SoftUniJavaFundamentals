package Exercises.BasicSyntaxEx;

/*
Write a program, which receives a number – n, and prints a triangle from 1 to n as in the examples.
 */

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int rows = 1; rows <= n; rows++) {
            for (int i = 0; i < rows; i++) {
                System.out.printf("%d ", rows);
            }
            System.out.println();
        }
    }
}
