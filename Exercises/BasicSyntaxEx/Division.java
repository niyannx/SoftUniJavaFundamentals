package Exercises.BasicSyntaxEx;

/*
You will be given an integer and you have to print on the console whether that number is divisible by the following
numbers: 2, 3, 6, 7, 10. You should always take the bigger division. If the number is divisible by both 2 and 3 it is
also divisible by 6 and you should print only the division by 6. If a number is divisible by 2 it is sometimes also
divisible by 10 and you should print the division by 10. If the number is not divisible by any of the given numbers
print &quot;Not divisible&quot;. Otherwise print &quot;The number is divisible by {number}&quot;.
 */

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        if (n % 10 == 0) {
            System.out.println("The number is divisible by 10");
        } else if (n % 7 == 0) {
            System.out.println("The number is divisible by 7");
        } else if (n % 6 == 0) {
            System.out.println("The number is divisible by 6");
        } else if (n % 3 == 0) {
            System.out.println("The number is divisible by 3");
        } else if (n % 2 == 0) {
            System.out.println("The number is divisible by 2");
        } else {
            System.out.println("Not divisible");
        }
    }
}
