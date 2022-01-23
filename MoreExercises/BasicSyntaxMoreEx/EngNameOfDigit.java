package MoreExercises.BasicSyntaxMoreEx;

/*
Write a method that returns the English name of the last digit of a given number. Write a program that reads an
integer and prints the returned value from this method.
 */

import java.util.Scanner;

public class EngNameOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String name = "";
        n = n % 10;

        switch (n) {
            case 1:
                name = "one";
                break;
            case 2:
                name = "two";
                break;
            case 3:
                name = "three";
                break;
            case 4:
                name = "four";
                break;
            case 5:
                name = "five";
                break;
            case 6:
                name = "six";
                break;
            case 7:
                name = "seven";
                break;
            case 8:
                name = "eight";
                break;
            case 9:
                name = "nine";
                break;
            case 0:
                name = "zero";
                break;
        }

        System.out.println(name);
    }
}
