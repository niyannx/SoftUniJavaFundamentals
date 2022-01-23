package MoreExercises.BasicSyntaxMoreEx;

/*
Write a program, which helps you buy the games. The valid games are the following games in this table:

         Name              | Price
OutFall 4                  | $39.99
CS: OG                     | $15.99
Zplinter Zell              | $19.99
Honored 2                  | $59.99
RoverWatch                 | $29.99
RoverWatch Origins Edition | $39.99

On the first line, you will receive your current balance – a floating-point number in the range [0.00…5000.00].
Until you receive the command “Game Time”, you have to keep buying games. When a game is bought, the user’s
balance decreases by the price of the game.
Additionally, the program should obey the following conditions:
 If a game the user is trying to buy is not present in the table above, print “Not Found” and read the next
line.
 If at any point, the user has $0 left, print “Out of money!” and end the program.
 Alternatively, if the user is trying to buy a game which they can’t afford, print “Too Expensive” and read
the next line.
When you receive “Game Time”, print the user’s remaining money and total spent on games, rounded to the 2 nd
decimal place.
*/

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double balance = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        double spent = 0;
        double price;

        while (!input.equals("Game Time")) {
            switch (input) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    input = scan.nextLine();
                    continue;
            }

            if (balance < price) {
                System.out.println("Too Expensive");
            } else {
                balance = balance - price;
                System.out.printf("Bought %s\n", input);
                spent = spent + price;
            }

            if (balance == 0) {
                System.out.println("Out of money!");
                break;
            }

            input = scan.nextLine();
        }
        if (balance != 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, balance);
        }
    }
}
