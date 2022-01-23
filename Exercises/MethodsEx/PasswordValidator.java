package Exercises.MethodsEx;

/*
Write a program that checks if a given password is valid. Password rules are:
 6 – 10 characters (inclusive);
 Consists only of letters and digits;
 Have at least 2 digits.
If a password is valid, print &quot;Password is valid&quot;. If it is not valid, for every unfulfilled rule print a message:
 &quot;Password must be between 6 and 10 characters&quot;;
 &quot;Password must consist only of letters and digits&quot;;
 &quot;Password must have at least 2 digits&quot;.
 */

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pass = scan.nextLine();

        checkValidity(pass);
    }

    private static void checkValidity(String pass) {
        boolean isValid = true;
        int count = 0;

        String noAlphanumerics = pass.replaceAll(
                "[a-zA-Z0-9]", "");

        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 48 && pass.charAt(i) <= 57) {
                count++;
            }
        }

        if (pass.length() > 10 || pass.length() < 6) {
            isValid = false;
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (noAlphanumerics.length() > 0) {
            isValid = false;
            System.out.println("Password must consist only of letters and digits");
        }

        if (count < 2) {
            isValid = false;
            System.out.println("Password must have at least 2 digits");
        }

        if (isValid) {
            System.out.println("Password is valid");
        }
    }
}
