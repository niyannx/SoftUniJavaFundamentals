package Exercises.MethodsEx;

/*
You will receive 3 integers. Write a method sum to get the sum of the first two integers and subtract method that
subtracts the third integer from the result from the sum method.
 */

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int n3 = Integer.parseInt(scan.nextLine());
        System.out.println(subtract(sum(n1, n2), n3));
    }

    private static int sum (int n1, int n2) {
        return n1 + n2;
    }

    private static int subtract (int sum, int n3) {
        return sum - n3;
    }
}
