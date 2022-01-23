package Exercises.BasicSyntaxEx;

/*
You are given a group of people, type of the group, on which day of the week they are going to stay. Based on that
information calculate how much they have to pay and print that price on the console. Use the table below. In each
cell is the price for a single person. The output should look like that: &quot;Total price: {price}&quot;. The price should
be formatted to the second decimal point.

           Friday   | Saturday |  Sunday
Students |   8.45   |   9.80   |  10.46
Business |  10.90   |  15.60   |    16
Regular  |    15    |    20    |   22.50

There are also discounts based on some conditions:
 Students – if the group is bigger than or equal to 30 people you should reduce the total price by 15%
 Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
 Regular – if the group is bigger than or equal 10 and less than or equal to 20 reduce the total price by 5%
 */

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();

        double overall = 0;
        double price;
        boolean discounted = false;

        if (day.equals("Friday")) {
            if (type.equals("Students")) {
                price = 8.45;
            } else if (type.equals("Business")) {
                price = 10.9;
            } else {
                price = 15;
            }
        } else if (day.equals("Saturday")) {
            if (type.equals("Students")) {
                price = 9.8;
            } else if (type.equals("Business")) {
                price = 15.6;
            } else {
                price = 20;
            }
        } else {
            if (type.equals("Students")) {
                price = 10.46;
            } else if (type.equals("Business")) {
                price = 16;
            } else {
                price = 22.5;
            }
        }


        if (type.equals("Students") && people >= 30) {
            overall = price * people;
            overall = overall - overall * 0.15;
            discounted = true;
        }
        if (type.equals("Business") && people >= 100) {
            overall = price * (people - 10);
            discounted = true;
        }
        if (type.equals("Regular") && (people >= 10 && people <= 20)) {
            overall = price * people;
            overall = overall - overall * 0.05;
            discounted = true;
        }

        if (!discounted) {
            overall = price * people;
        }
        System.out.printf("Total price: %.2f", overall);
    }
}
