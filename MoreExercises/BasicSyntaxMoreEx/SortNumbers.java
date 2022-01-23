package MoreExercises.BasicSyntaxMoreEx;

/*
Read three real numbers and sort them in descending order. Print each number on a new line.
 */

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int n3 = Integer.parseInt(scan.nextLine());

        int[] a = {n1, n2, n3};
        int n = a.length;
        // bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int placeholder = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = placeholder;
                }
            }
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(a[i]);
            System.out.println();
        }
    }
}
