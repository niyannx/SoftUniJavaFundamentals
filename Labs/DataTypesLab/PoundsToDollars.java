package Labs.DataTypesLab;

/*
Write a program that converts British pounds to US dollars formatted to 3th decimal point.
1 British Pound = 1.36 Dollars
 */

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pounds = Double.parseDouble(scan.nextLine());
        double dollars = pounds * 1.36;
        System.out.printf("%.3f", dollars);
    }
}
