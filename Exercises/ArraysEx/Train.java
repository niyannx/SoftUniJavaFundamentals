package Exercises.ArraysEx;

/*
You will be given a count of wagons in a train n. On the next n lines, you will receive how many people are going to
get on that wagon. At the end print the whole train and after that the sum of the people in the train.
 */

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            arr[i] = num;
            sum += num;
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        System.out.println(sum);
    }
}
