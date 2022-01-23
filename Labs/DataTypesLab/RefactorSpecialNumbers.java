package Labs.DataTypesLab;

/*
You are given a working code that is a solution to Problem 9. Special Numbers. However, the variables are
improperly named, declared before they are needed and some of them are used for multiple things.
Without using your previous solution, modify the code so that it is easy to read and understand.
 */

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int currNum = 1; currNum <= n; currNum++) {
            int sum = 0;
            int i = currNum;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }

            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);

            System.out.printf("%d -> %b\n", currNum, isSpecial);
            currNum = 0;
        }
    }
}
