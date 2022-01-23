package Labs.DataTypesLab;

/*
Write a program that prints whether a given character is upper-case or lower-case.
 */

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char ch = scan.next().charAt(0);

        if (ch >= 65 && ch <= 90) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
