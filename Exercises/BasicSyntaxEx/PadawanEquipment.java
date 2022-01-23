package Exercises.BasicSyntaxEx;

/*
Yoda is starting his newly created Jedi academy. So, he asked Master George Lucas to buy the needed equipment.
The number of items depends on how many students will sign up. The equipment for the Padawan contains
lightsabers, belts and robes.
You will be given the amount of money George Lucas has, the number of students and the prices of each item. You
have to help George Lucas calculate if the money he has is enough to buy all of the equipment, or how much more
money he needs.
Because the lightsabers sometimes brake, George Lucas should buy 10% more, rounded up to the next integer.
Also, every sixth belt is free.
 */

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double saberPrice = Double.parseDouble(scan.nextLine());
        double robePrice = Double.parseDouble(scan.nextLine());
        double beltPrice = Double.parseDouble(scan.nextLine());
        double fullSaberPrice = Math.ceil(students + students * 0.1) * saberPrice;
        double fullRobePrice = students * robePrice;
        double fullBeltPrice = beltPrice * students;
        int freeBelt = students / 6;
        double overall = fullSaberPrice + fullRobePrice + (fullBeltPrice - (freeBelt * beltPrice));

        if (overall > budget) {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(overall - budget));
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", overall);
        }
    }
}
