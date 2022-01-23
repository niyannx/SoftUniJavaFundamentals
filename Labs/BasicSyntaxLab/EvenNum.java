package Labs.BasicSyntaxLab;

/*
Take as an input an even number and print its absolute value. If the number is odd, print &quot;Please write an even
number.&quot; and continue reading numbers.
 */

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        while (n % 2 != 0) {
            System.out.println("Please write an even number.");
            n = Integer.parseInt(scan.nextLine());
        }
        System.out.printf("The number is: %d", Math.abs(n));
    }
}
