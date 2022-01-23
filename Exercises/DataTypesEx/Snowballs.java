package Exercises.DataTypesEx;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantity = Integer.parseInt(scan.nextLine());
        double bestSnowball = Double.MIN_VALUE;

        int bestSnow = 0, bestTime = 0, bestQuality = 0;
        double bestValue = 0;

        for (int i = 0; i < quantity; i++) {
            int snow = Integer.parseInt(scan.nextLine());
            int time = Integer.parseInt(scan.nextLine());
            int quality = Integer.parseInt(scan.nextLine());

            double value = Math.pow((double)snow / time, quality);

            if (value > bestSnowball) {
                bestSnowball = value;
                bestSnow = snow;
                bestTime = time;
                bestValue = value;
                bestQuality = quality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, bestValue, bestQuality);
    }
}
