package Labs.ArraysLab;

/*
Write a program that calculates the difference between the sum of the even and the sum of the odd numbers in an
array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        int[] arr = Arrays.stream(line.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumOfEven += arr[i];
            } else {
                sumOfOdd += arr[i];
            }
        }

        int diff = sumOfEven - sumOfOdd;
        System.out.println(diff);
    }
}
