package Labs.BasicSyntaxLab;

/*
Write a program, which takes as an input a grade and prints &quot;Passed!&quot; if the grade is equal or more than 3.00.
 */

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());

        if (grade >= 3) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
