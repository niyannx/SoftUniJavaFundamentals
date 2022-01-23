package Labs.ArraysLab;

/*
Enter a day number [1…7] and print the day name (in English) or &quot;Invalid day!&quot;. Use an array of strings.
 */

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n = Integer.parseInt(scan.nextLine());

        if (n >= 1 && n <= 7) {
            System.out.println(week[n - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
