package Exercises.ArraysEx;

/*
Write a program, which prints all unique pairs in an array of integers whose sum is equal to a given number.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumNeeded = Integer.parseInt(scan.nextLine());

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int currSum = arr[i] + arr[j];

                if (currSum == sumNeeded) {
                    output.append(arr[i]).append(" ").append(arr[j]);
                    System.out.println(output);
                    output.setLength(0);
                }
            }
        }
    }
}
