package Exercises.MethodsEx;

/*
You will receive a single string. Write a method that prints the middle character. If the length of the string is even,
there are two middle characters.
 */

import java.util.Scanner;

public class MiddleChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        if (hasMiddle(input)) {
            System.out.println(input.charAt(input.length() / 2));
        } else {
            System.out.print(input.charAt((int)Math.floor((double)(input.length() - 1) / 2)));
            System.out.print(input.charAt((int)Math.ceil((double)(input.length() - 1) / 2)));
        }
    }

    public static boolean hasMiddle(String input){
        return (input.length() - 1) % 2 == 0;
    }
}
