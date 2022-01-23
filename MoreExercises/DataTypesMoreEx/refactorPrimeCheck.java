package MoreExercises.DataTypesMoreEx;

/*
You are given a program that checks if numbers in a given range [2...N] are prime. For each number is printed
&quot;{number} -&gt; {true or false}&quot;. The code however, is not very well written. Your job is to modify it in a way
that is easy to read and understand.
 */

import java.util.Scanner;

public class refactorPrimeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int flag = 2; flag < i; flag++) {
                if (i % flag == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b\n", i, isPrime);
        }
    }
}
