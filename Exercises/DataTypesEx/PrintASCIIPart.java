package Exercises.DataTypesEx;

/*
Find online more information about ASCII (American Standard Code for Information Interchange) and write a
program that prints part of the ASCII table of characters at the console.
 */

import java.util.Scanner;

public class PrintASCIIPart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());

        for (char i = (char) n1; i <= n2; i++) {
            System.out.printf("%c ", i);
        }
    }
}
