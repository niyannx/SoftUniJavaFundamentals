package Exercises.BasicSyntaxEx;

/*
Write a program that determines whether based on the given age a person is: baby, child, teenager, adult, elder.
The bounders are:
 0-2 – baby;
 3-13 – child;
 14-19 – teenager;
 20-65 – adult;
 &gt;=66 – elder;
 All the values are inclusive.
 */

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        String state;

        if (age >= 0 && age <= 2) {
            state = "baby";
        } else if (age <= 13) {
            state = "child";
        } else if (age <= 19) {
            state = "teenager";
        } else if (age <= 65) {
            state = "adult";
        } else {
            state = "elder";
        }
        System.out.println(state);
    }
}
