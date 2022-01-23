package Labs.BasicSyntaxLab;

/*
A theatre is doing a ticket sale, but they need a program to calculate the price of a single ticket. If the given age
does not fit one of the categories, you should print &quot;Error!&quot;. You can see the prices in the table below:

Day / Age | 0 <= age <= 18 |  18 < age <= 64 | 64 < age <= 122
Weekday   |       12$      |       18$       |        12$
Weekend   |       15$      |       20$       |        15$
Holiday   |       5$       |       12$       |        10$
 */

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        int price = 0;
        boolean error = false;

        switch (day) {
            case "Weekday":
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 12;
                } else if (age > 18 && age <= 64) {
                    price = 18;
                } else {
                    System.out.println("Error!");
                    error = true;
                }
                break;
            case "Weekend":
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 15;
                } else if (age > 18 && age <= 64) {
                    price = 20;
                } else {
                    System.out.println("Error!");
                    error = true;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    price = 5;
                } else if (age >= 0 && age <= 64) {
                    price = 12;
                } else if (age >= 0 && age <= 122) {
                    price = 10;
                } else {
                    System.out.println("Error!");
                    error = true;
                }
                break;
        }
        if (!error) {
            System.out.println(price + "$");
        }
    }
}
