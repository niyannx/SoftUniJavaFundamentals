package Labs.BasicSyntaxLab;

/*
You will receive an integer as an input from the console. Print the 10 times table for this integer. See the examples
below for more information.
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int a = Integer.parseInt(scan.nextLine());

        if (a <= 10) {
            for (int i = a; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", n, i, n * i);
            }
        } else {
            System.out.printf("%d X %d = %d", n, a, n * a);
        }
    }
}
