package Labs.BasicSyntaxLab;

/*
You will be given 3 lines of input – student name, age and average grade. Your task is to print all the info about the
student in the following format: &quot;Name: {student name}, Age: {student age}, Grade: {student
grade}&quot;.
 */

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        double grade = Double.parseDouble(scan.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
    }
}
