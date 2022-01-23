package Exercises.DataTypesEx;

/*
Calculate how many courses will be needed to elevate n persons by using an elevator with capacity of p persons.
The input holds two lines: the number of people n and the capacity p of the elevator.
 */

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        int courses = (int)Math.ceil((double) people / capacity);
        System.out.printf("%d", courses);
    }
}
