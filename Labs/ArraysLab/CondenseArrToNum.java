package Labs.ArraysLab;

/*
Write a program to read an array of integers and condense them by summing adjacent couples of elements until a
single integer is obtained. For example, if we have 3 elements {2, 10, 3}, we sum the first two and the second two
elements and obtain {2+10, 10+3} = {12, 13}, then we sum again all adjacent elements and obtain {12+13} = {25}.
 */

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrToNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        int[] arr = Arrays.stream(line.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (arr.length != 1) {
            int currLength = arr.length - 1;

            int[] condensed = new int[currLength];

            for (int i = arr.length - 1; i > 0; i--) {
                condensed[currLength - 1] = arr[i] + arr[i - 1];
                currLength--;

                if (currLength == 0) {
                    arr = condensed;
                    currLength = arr.length - 1;
                    condensed = new int[currLength];
                    i = arr.length;
                }
            }
        }
        System.out.println(arr[0]);
    }
}
