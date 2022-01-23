package Exercises.AssociativeArraysEx;

/*
You&#39;ve beaten all the content and the last thing left to accomplish is own a legendary item. However, it&#39;s a tedious
process and requires quite a bit of farming.
Anyway, you are not too pretentious - any legendary will do. The possible items are:
 Shadowmourne - requires 250 Shards
 Valanyr - requires 250 Fragments
 Dragonwrath - requires 250 Motes
Shards, Fragments and Motes are the key materials, all else is junk. You will be given lines of input, such as
&quot;2 motes 3 ores 15 stones&quot;. Keep track of the key materials - the first that reaches the 250 mark wins the race. At
that point, print the corresponding legendary obtained. Then, print the remaining shards, fragments, motes,
ordered by quantity in descending order, then by name in ascending order, each on a new line. Finally, print the
collected junk items, in alphabetical order.
 */

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // hashmap where we store the resources we need and their quantities
        TreeMap <String, Integer> items = new TreeMap<>();
        // treemap where we store the junk resources and their quantities
        TreeMap <String, Integer> junk = new TreeMap<>();

        items.put("fragments", 0);
        items.put("shards", 0);
        items.put("motes", 0);

        // while no item is obtained, scan next resource and quantity
        while (itemObtained(items).equals("")) {
            int quantity = Integer.parseInt(scan.next());
            String resource = scan.next().toLowerCase();

            // if we need the resource for a legendary item:
            if (resource.equals("fragments") || resource.equals("shards") || resource.equals("motes")) {
                items.put(resource, items.get(resource) + quantity);
            } // if the resource is junk:
            else {
                if (junk.containsKey(resource)) {
                    junk.put(resource, junk.get(resource) + quantity);
                } else {
                    junk.put(resource, quantity);
                }
            }
        }

        // when item is obtained:
        System.out.printf("%s obtained!\n", itemObtained(items));

        // remove resources needed for the item
        if (itemObtained(items).equals("Shadowmourne")) {
            items.put("shards", items.get("shards") - 250);
        } else if (itemObtained(items).equals("Valanyr")) {
            items.put("fragments", items.get("fragments") - 250);
        } else {
            items.put("motes", items.get("motes") - 250);
        }

        LinkedHashMap <String, Integer> sortedValuableItems = new LinkedHashMap<>();

        // sort hashmap by quantity is descending order
        items.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedValuableItems.put(x.getKey(), x.getValue()));
        // print sorted hashmap
        for (Map.Entry<String, Integer> entry : sortedValuableItems.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }

        // print all other materials alphabetically (the treemap)
        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }
    }

    // method to find which item is obtained, if any
    public static String itemObtained (TreeMap <String, Integer> items) {
        if (items.get("shards") >= 250) {
            return "Shadowmourne";
        }

        if (items.get("fragments") >= 250) {
            return "Valanyr";
        }


        if (items.get("motes") >= 250) {
            return "Dragonwrath";
        }

        return "";
    }
}
