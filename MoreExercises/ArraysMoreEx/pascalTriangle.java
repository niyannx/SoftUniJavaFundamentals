package MoreExercises.ArraysMoreEx;

/*
The triangle may be constructed in the following manner: In row 0 (the topmost row), there is a unique nonzero
entry 1. Each entry of each subsequent row is constructed by adding the number above and to the left with the
number above and to the right, treating blank entries as 0. For example, the initial number in the first (or any other)
row is 1 (the sum of 0 and 1), whereas the numbers 1 and 3 in the third row are added to produce the number 4 in
the fourth row.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        ArrayList<Integer> oldArr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int[] currArr = new int[i];

            currArr[0] = 1;
            currArr[currArr.length - 1] = 1;

            if (i >= 3) {
                for (int j = 1; j < currArr.length - 1; j++) {
                    currArr[j] = oldArr.get(j - 1) + oldArr.get(j);
                }
            }

            System.out.println(Arrays.toString(currArr).replaceAll("[,\\[|\\]]", ""));
            for (int j = 0; j < i; j++) {
                oldArr.add(j, currArr[j]);
            }
        }
    }
}
