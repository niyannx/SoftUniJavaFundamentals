package MoreExercises.MethodsMoreEx;

/*
You are given a number num1, num2 and num3. Write a program that finds if num1 * num2 * num3 (the product)
is negative, positive or zero. Try to do this WITHOUT multiplying the 3 numbers.
 */

import java.util.Scanner;

public class MultiplicationSign {

    private static int PositiveNegative(int n1, int n2, int n3) {
        int res = 0;

        if (n1 == 0 || n2 == 0 || n3 == 0) {
            res = -1;
            return res;
        }

        if (n1 > 0) {
            res++;
        }
        if (n2 > 0) {
            res++;
        }
        if (n3 > 0) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int n3 = Integer.parseInt(scan.nextLine());

        int res = PositiveNegative(n1, n2, n3);

        if (res == -1) {
            System.out.println("zero");
        } else if (res % 2 == 0) {
            System.out.println("negative");
        } else if (res % 2 != 0) {
            System.out.println("positive");
        }
    }
}
