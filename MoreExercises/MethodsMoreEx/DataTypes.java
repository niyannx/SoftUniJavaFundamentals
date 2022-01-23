package MoreExercises.MethodsMoreEx;

/*
Write a program that, depending on the first line of the input, reads an int, double or string.
 If the data type is int, multiply the number by 2.
 If the data type is real, multiply the number by 1.5 and format it to the second decimal point.
 If the data type is string, surround the input with &quot;$&quot;.
Print the result on the console.
 */

import java.util.Scanner;

public class DataTypes {
    public static int convertInt(String input) {
        int n = Integer.parseInt(input);
        return n * 2;
    }

    public static StringBuilder convertString(String input) {
        StringBuilder output = new StringBuilder();
        output.append("$").append(input).append("$");
        return output;
    }

    public static double convertReal(String input) {
        double n = Double.parseDouble(input);
        return n * 1.5;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        String input = scan.nextLine();

        if (type.equals("int")) {
            System.out.println(convertInt(input));
        } else if (type.equals("real")) {
            System.out.printf("%.2f", convertReal(input));
        } else {
            System.out.println(convertString(input));
        }
    }
}
