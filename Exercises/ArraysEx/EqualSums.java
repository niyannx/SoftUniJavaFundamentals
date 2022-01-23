package Exercises.ArraysEx;

/*
Write a program that determines if there exists an element in the array such that the sum of the elements on its
left is equal to the sum of the elements on its right. If there are no elements to the left / right, their sum is
considered to be 0. Print the index that satisfies the required condition or &quot;no&quot; if there is no such index.
 */

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // read int array from console
        int[] arr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // initiate and define variables for sum values
        int sumLeft = 0;
        int sumRight = 0;

        boolean hasSum = false;

        // loop through the array
        for (int i = 0; i < arr.length; i++) {
            // if array is one 1 number, print sum 0 and terminate the program
            if (arr.length == 1) {
                hasSum = true;
                System.out.println(0);
                break;
            }

            // loop through elements left of curr number
            for (int j = 0; j < i; j++) {
                sumLeft += arr[j];
            }

            // loop through elements right of curr number
            for (int j = i + 1; j < arr.length; j++) {
                sumRight += arr[j];
            }

            // if sums are equal
            if (sumLeft == sumRight) {
                hasSum = true;
                // print the index of the number
                System.out.println(i);
            }

            sumLeft = 0;
            sumRight = 0;
        }

        if (!hasSum) {
            System.out.println("no");
        }
    }
}
