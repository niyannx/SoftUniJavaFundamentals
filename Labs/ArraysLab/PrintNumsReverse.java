package Labs.ArraysLab;

/*
Read n numbers and print them in reverse order.
 */

import java.util.Scanner;

public class PrintNumsReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            nums[i] = number;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.printf("%d ", nums[i]);
        }
    }
}
