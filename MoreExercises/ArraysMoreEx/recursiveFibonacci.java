package MoreExercises.ArraysMoreEx;

/*
The Fibonacci sequence is quite a famous sequence of numbers. Each member of the sequence is calculated from
the sum of the two previous elements. The first two elements are 1, 1. Therefore the sequence goes as 1, 1, 2, 3, 5,
8, 13, 21, 34…
The following sequence can be generated with an array, but that’s easy, so your task is to implement recursively.
So if the function GetFibonacci(n) returns the n’th Fibonacci number we can express it using GetFibonacci(n) =
GetFibonacci(n-1) + GetFibonacci(n-2).
However, this will never end and in a few seconds a StackOverflow Exception is thrown. In order for the recursion to
stop it has to have a “bottom”. The bottom of the recursion is GetFibonacci(2) should return 1 and GetFibonacci(1)
should return 1.
 */

import java.util.Scanner;

public class recursiveFibonacci {

    public static void getFibonacci(int count) {
        long n1 = 0;
        long n2 = 1;
        long n3 = 0;

        for (int i = 2; i <= count; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(n3);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        getFibonacci(n);
    }
}
