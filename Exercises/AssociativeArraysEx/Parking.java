package Exercises.AssociativeArraysEx;

/*
SoftUni just got a new parking lot. It&#39;s so fancy, it even has online parking validation. Except, the online service
doesn't work. It can only receive users&#39; data, but doesn't know what to do with it. Good thing you&#39;re on the dev team
and know how to fix it, right?

Write a program, which validates parking for an online service. Users can register to park and unregister to leave.
The program receives 2 commands:
 &quot;register {username} {licensePlateNumber}&quot;:
o The system only supports one car per user at the moment, so if a user tries to register another
license plate, using the same username, the system should print:
&quot;ERROR: already registered with plate number {licensePlateNumber}&quot;
o If the aforementioned checks pass successfully, the plate can be registered, so the
system should print:
&quot;{username} registered {licensePlateNumber} successfully&quot;

 &quot;unregister {username}&quot;:
o If the user is not present in the database, the system should print:
&quot;ERROR: user {username} not found&quot;
o If the aforementioned check passes successfully, the system should print:
&quot;{username} unregistered successfully&quot;

After you execute all the commands, print all the currently registered users and their license plates in the format:
 {username} => {licensePlateNumber}
 */

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap <String, String> parkingLot = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split(" ");
            String command = data[0];
            String name = data[1];

            switch (command) {
                case "register":
                    String licensePlate = data[2];

                    if (!parkingLot.containsKey(name)) {
                        parkingLot.put(name, licensePlate);
                        System.out.println(name + " registered " + licensePlate + " successfully");
                    } else {
                        System.out.println("ERROR: already registered with plate number " + licensePlate);
                    }

                break;

                case "unregister":

                    if (!parkingLot.containsKey(name)) {
                        System.out.println("ERROR: user " + name + " not found");
                    } else {
                        parkingLot.remove(name);
                        System.out.println(name + " unregistered successfully");
                    }

                break;
            }
        }

        parkingLot.forEach((userName, licensePlate) -> System.out.println(userName + " => " + licensePlate));
    }
}
