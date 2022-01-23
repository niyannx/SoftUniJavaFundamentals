package Labs.AssociativeArraysLab.OddOccurrences;

/*
Write a program that extracts from a given sequence of words all elements that are present in it an odd number of
times (case-insensitive).
 */

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String s : input) {
            String word = s.toLowerCase();
            if (!counts.containsKey(word)) {
                counts.put(word, 1);
            } else {
                counts.put(word, counts.get(word) + 1);
            }
        }

        ArrayList<String> oddNumbers = new ArrayList<>();

        for (var entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                oddNumbers.add(entry.getKey());
            }
        }

        for (int i = 0; i < oddNumbers.size(); i++) {
            System.out.print(oddNumbers.get(i));

            if (i < oddNumbers.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
