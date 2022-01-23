package Labs.DataTypesLab;

/*
Write a program that reads 3 lines of input. On each line you get a single character. Combine all the characters into
one string and print it on the console.
 */

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char one = scan.next().charAt(0);
        char two = scan.next().charAt(0);
        char three = scan.next().charAt(0);

        StringBuilder output = new StringBuilder();
        output.append(one);
        output.append(two);
        output.append(three);

        System.out.println(output);
    }
}
