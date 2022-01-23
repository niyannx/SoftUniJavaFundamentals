package Exercises.ArraysEx;

/*
Write a program that finds the longest sequence of equal elements in an array of integers. If several longest
sequences exist, print the leftmost one.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualEl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = 0;
        int index;
        int bestSeqCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    index = i;
                    if (count > max) {
                        max = count;
                        bestSeqCount = index;
                    }
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < max; i++) {
            System.out.printf("%d ", arr[i + bestSeqCount]);
        }
    }
}
