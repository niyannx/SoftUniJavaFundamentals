package Exercises.ArraysEx;

/*
Write a program that receives an array and number of rotations you have to perform (first element goes at the end)
Print the resulting array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrRotation {
    public static void main(String[] args) {
        // implement scanner
        Scanner scan = new Scanner(System.in);

        // read int array from console
        int[] arr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // read number of rotations
        int rotations = Integer.parseInt(scan.nextLine());

        // define an array (where we will keep the rotated version)
        int[] arrRotated = new int[arr.length];

        // variable "element" (where we keep the index of the rotated arr)
        int el = 0;

        // loop through number of rotations
        for (int i = 0; i < rotations; i++) {
            // loop through the array's elements one by one
            for (int j = 0; j < arr.length; j++) {

                if (j == 0) {
                    // make first element - last
                    arrRotated[arrRotated.length - 1] = arr[j];
                } else {
                    // fill the rest of the array
                    arrRotated[el] = arr[j];
                    // increment the value of "element"
                    el++;
                }
            }
            // save the rotated array as the original one
            // (the next two statements are there, so we can loop through the rotation loop once again)
            System.arraycopy(arrRotated, 0, arr, 0, arr.length);
            el = 0;
        }

        // print the rotated array
        for (int j : arr) {
            System.out.printf("%d ", j);
        }
    }
}
