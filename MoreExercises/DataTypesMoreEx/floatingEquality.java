package MoreExercises.DataTypesMoreEx;

/*
Write a program that safely compares floating-point numbers (double) with precision eps = 0.000001. Note that we
cannot directly compare two floating-point numbers a and b by a==b because of the nature of the floating-point
arithmetic. Therefore, we assume two numbers are equal if they are more closely to each other than some fixed
constant eps.
You will receive two lines, each containing a floating-point number. Your task is to compare the values of the two
numbers.
 */

import java.util.Scanner;

public class floatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1 = Double.parseDouble(scan.nextLine());
        double n2 = Double.parseDouble(scan.nextLine());

        double eps = Math.abs(n1 - n2);
        String equal = " ";

        if (eps > 0.000001) {
            equal = "False";
        } else {
            equal = "True";
        }
        System.out.println(equal);
    }
}
