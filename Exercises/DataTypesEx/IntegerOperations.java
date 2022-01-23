package Exercises.DataTypesEx;

/*
Read four integer numbers.
Add first to the second, divide (integer) the sum by the third number and multiply the result by the fourth number.
Print the result.
 */

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int n3 = Integer.parseInt(scan.nextLine());
        int n4 = Integer.parseInt(scan.nextLine());

        int result = ((n1 + n2) / n3) * n4;
        System.out.println(result);

    }
}
