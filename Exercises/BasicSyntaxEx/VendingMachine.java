package Exercises.BasicSyntaxEx;

/*
You task is to calculate the total price of a purchase from a vending machine. Until you receive &quot;Start&quot; you will be
given different coins that are being inserted in the machine. You have to sum them in order to have the total money
inserted. There is a problem though. Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins. If someone
tries to insert some other coins you have to display &quot;Cannot accept {money}&quot;, where the value is formatted to
the second digit after the decimal point and not add it to the total money. On the next few lines until you receive
&quot;End&quot; you will be given products to purchase. Your machine has however only &quot;Nuts&quot;, &quot;Water&quot;, &quot;Crisps&quot;, &quot;Soda&quot;,
&quot;Coke&quot;. The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively. If the person tries to purchase a not existing product
print “Invalid product”. Be careful that the person may try to purchase a product for which he doesn&#39;t have
money. In that case print &quot;Sorry, not enough money&quot;. If the person purchases a product successfully print
&quot;Purchased {product name}&quot;. After the “End” command print the money that are left formatted to the second
decimal point in the format &quot;Change: {money left}&quot;.
 */

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input  = scan.nextLine();
        boolean validMoney;
        boolean invalidProduct = false;
        double totalMoney = 0;

        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);

            validMoney = coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2;
            if (!validMoney) {
                System.out.printf("Cannot accept %.2f\n", coin);
                input = scan.nextLine();
                continue;
            }
            totalMoney += coin;

            input = scan.nextLine();
        }
        input = scan.nextLine();

        double price = 0;

        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    price = 2;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1;
                    break;
                default:
                    System.out.println("Invalid product");
                    invalidProduct = true;
            }
            if (!invalidProduct) {
                if (totalMoney < price) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.printf("Purchased %s\n", input);
                    totalMoney = totalMoney - price;
                }
            } else {
                input = scan.nextLine();
                continue;
            }
            input = scan.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);
    }
}
