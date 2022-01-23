package MoreExercises.DataTypesMoreEx;

/*
You will receive an input until you receive &quot;END&quot;. Find what data type is the input. Possible data types are:
 Integer
 Floating point
 Characters
 Boolean
 Strings
Print the result in the following format: &quot;{input} is {data type} type&quot;
 */

import java.util.Scanner;

public class dataTypeFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equals("END")) {
            Scanner scan2 = new Scanner(input);
            if (scan2.hasNextBoolean()) {
                System.out.printf("%s is boolean type\n", input);
            } else if (scan2.hasNextInt()) {
                System.out.printf("%s is integer type\n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type\n", input);
            } else if (scan2.hasNextDouble()) {
                System.out.printf("%s is floating point type\n", input);
            } else if (scan2.hasNextLine()) {
                System.out.printf("%s is string type\n", input);
            }

            input = scan.nextLine();
        }

    }
}
