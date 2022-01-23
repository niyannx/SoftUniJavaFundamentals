package Exercises.MethodsEx;

/*
Write a method that receives a single string and prints the count of the vowels. Use appropriate name for the
method.
 */

import java.util.Scanner;

public class VowelsCount {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println(vowels(input));
    }

    private static int vowels(String input) {
        String vowels = "AEIOUaeiou";
        int count = 0;

        for (int i = 0; i < vowels.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (String.valueOf(vowels.charAt(i)).equals(String.valueOf(input.charAt(j)))) {
                    count++;
                }
            }
        }

        return count;
    }
}
