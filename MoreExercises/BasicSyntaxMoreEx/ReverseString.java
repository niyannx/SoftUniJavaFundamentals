package MoreExercises.BasicSyntaxMoreEx;

// Write a program which reverses a string and print it on the console.

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder reverse = new StringBuilder();

        reverse.append(input);
        reverse.reverse();

        System.out.println(reverse);
    }
}
