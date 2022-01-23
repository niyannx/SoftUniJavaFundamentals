package Exercises.DataTypesEx;

/*
You have a water tank with capacity of 255 liters.
On the next n lines, you will receive liters of water, which you have to pour in your tank.
If the capacity is not enough, print “Insufficient capacity!” and continue reading the next line. On the last
line, print the liters in the tank.
 */

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int capacity = 255;
        int lines = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < lines; i++) {
            int liters = Integer.parseInt(scan.nextLine());

            if (capacity - liters < 0) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity = capacity - liters;
            }
        }
        System.out.println(255 - capacity);
    }
}
