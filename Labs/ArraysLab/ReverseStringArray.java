package Labs.ArraysLab;

/*
Write a program to read an array of strings, reverse it and print its elements. The input consists of a sequence of
space separated strings. Print the output on a single line (space separated).
 */

import java.util.Scanner;

public class ReverseStringArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineInput = scan.nextLine();

        String[] arr = lineInput.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("%s ", arr[i]);
        }
    }
}
