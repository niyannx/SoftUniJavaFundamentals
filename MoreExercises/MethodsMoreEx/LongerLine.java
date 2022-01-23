package MoreExercises.MethodsMoreEx;

/*
You are given the coordinates of four points in the 2D plane. The first and the second pair of points form two
different lines. Print the longer line in format &quot;(X1, Y1)(X2, Y2)&quot; starting with the point that is closer to the center of
the coordinate system (0, 0) (You can reuse the method that you wrote for the previous problem). If the lines are of
equal length, print only the first one.
 */

import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());

        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double x3 = Double.parseDouble(scan.nextLine());
        double y3 = Double.parseDouble(scan.nextLine());

        double x4 = Double.parseDouble(scan.nextLine());
        double y4 = Double.parseDouble(scan.nextLine());

        double lineA = calculateLineLength(x1, y1, x2, y2);
        double lineB = calculateLineLength(x3, y3, x4, y4);

        if (lineA >= lineB && checkCloserPoint(x1, y1, x2, y2)) {
            printLine(x1, y1, x2, y2);
        } else if (lineA >= lineB && !checkCloserPoint(x1, y1, x2, y2)) {
            printLine(x2, y2, x1, y1);
        } else if (lineA < lineB && checkCloserPoint(x3, y3, x4, y4)) {
            printLine(x3, y3, x4, y4);
        } else if (lineA < lineB && !checkCloserPoint(x3, y3, x4, y4)) {
            printLine(x4, y4, x3, y3);
        }
    }

    private static boolean checkCloserPoint(double a1, double b1, double a2, double b2) {
        boolean isCloserToZero = false;

        double dist1 = Math.sqrt(Math.pow(a1, 2) + Math.pow(b1, 2));
        double dist2 = Math.sqrt(Math.pow(a2, 2) + Math.pow(b2, 2));

        if (dist1 <= dist2) {
            isCloserToZero = true;
        }
        return isCloserToZero;
    }

    private static double calculateLineLength(double a1, double b1, double a2, double b2) {
        return Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
    }

    private static void printLine(double a1, double b1, double a2, double b2) {
        System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", a1, b1, a2, b2);
    }
}
