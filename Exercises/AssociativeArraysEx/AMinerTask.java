package Exercises.AssociativeArraysEx;

/*
Until you receive &quot;stop&quot; command, you will be given a sequence of strings, each on a new line. Every odd line on
the console is representing a resource (e.g. Gold, Silver, Copper, etc.) and every even - quantity. Your task is to
collect the resources and print them each on a new line.
Print the resources and their quantities in format: {resource} –> {quantity}
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resource = scan.nextLine();

        LinkedHashMap <String, Integer> collectedResources = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scan.nextLine());

            if (collectedResources.containsKey(resource)) {
                collectedResources.put(resource, collectedResources.get(resource) + quantity);
            } else {
                collectedResources.put(resource, quantity);
            }

            resource = scan.nextLine();
        }

         for (Map.Entry<String, Integer> entry : collectedResources.entrySet()) {
             System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
         }
    }
}
