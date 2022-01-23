package MoreExercises.MethodsMoreEx;

/*
You are given the coordinates of two points on a Cartesian coordinate system - X1, Y1, X2 and Y2. Create a method
that prints the point that is closest to the center of the coordinate system (0, 0) in the format (X, Y). If the points are
on a same distance from the center, print only the first one.
 */

import java.util.Scanner;

public class CenterPoint {
    public static void closestTo(double x1, double y1, double x2, double y2) {
        double first = Math.sqrt(Math.pow(y1, 2) + Math.pow(x1, 2));
        double second = Math.sqrt(Math.pow(y2, 2) + Math.pow(x2, 2));

        if (first < second) {
            System.out.printf("(%.0f, %.0f)", x1, y1);
        } else {
            System.out.printf("(%.0f, %.0f)", x2, y2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        closestTo(x1, y1, x2, y2);
    }
}
