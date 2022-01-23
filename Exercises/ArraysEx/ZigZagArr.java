package Exercises.ArraysEx;

/*
Write a program which creates 2 arrays. You will be given an integer n. On the next n lines, you get 2 integers. Form
2 arrays as shown below.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int place1 = 0;
        int place2 = 0;

        for (int i = 1; i <= n; i++) {
            int[] line = Arrays
                    .stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (i % 2 == 0) {
                arr1[place1] = line[1];
                arr2[place2] = line[0];
            } else {
                arr1[place1] = line[0];
                arr2[place2] = line[1];
            }
            place1++;
            place2++;
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr1[i]);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr2[i]);
        }
    }
}
