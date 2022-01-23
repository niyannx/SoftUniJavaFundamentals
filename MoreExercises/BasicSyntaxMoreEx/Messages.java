package MoreExercises.BasicSyntaxMoreEx;

// Write a program, which emulates typing an SMS, following this guide:

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder output = new StringBuilder();
        double offset;
        double letterIndex;

        int lengthMessage = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < lengthMessage; i++) {
            int n = Integer.parseInt(scan.nextLine());

            int length = String.valueOf(n).length();
            int mainDigit = n % 10;

            if (mainDigit == 0) {
                output.append(" ");
            } else {
                offset = (mainDigit - 2) * 3;
                if (mainDigit == 8 || mainDigit == 9) {
                    offset += 1;
                }
                letterIndex = (offset + length - 1);
                char letter = (char) (97 + letterIndex);

                output.append(letter);
            }
        }

        System.out.println(output);
    }
}
