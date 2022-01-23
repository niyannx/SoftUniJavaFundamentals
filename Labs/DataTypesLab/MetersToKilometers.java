package Labs.DataTypesLab;

/*
You will be given an integer that will be distance in meters. Write a program that converts meters to kilometers
formatted to the second decimal point.
 */

import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int meters = Integer.parseInt(scan.nextLine());
        double kilometers = meters / 1000d;

        System.out.printf("%.2f", kilometers);
    }
}
