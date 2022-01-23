package Labs.ArraysLab;

/*
Read two arrays and print on the console whether they are identical or not. Arrays are identical if their elements are
equal. If the arrays are identical find the sum of the first one and print on the console following message: &quot;Arrays
are identical. Sum: {sum}&quot;, otherwise find the first index where the arrays differ and print on the console
following message: &quot;Arrays are not identical. Found difference at {index} index.&quot;
 */

import java.util.Arrays;
import java.util.Scanner;

public class EqualArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Line1 = scan.nextLine();
        String Line2 = scan.nextLine();

        int[] arr1 = Arrays
                .stream(Line1.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arr2 = Arrays
                .stream(Line2.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        boolean identical = true;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
            if (arr1[i] != arr2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                identical = false;
                break;
            }
        }
        if (identical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
