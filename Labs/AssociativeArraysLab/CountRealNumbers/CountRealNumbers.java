package Labs.AssociativeArraysLab.CountRealNumbers;

/*
Read a list of real numbers and print them in ascending order along with their number of occurrences.
 */

import java.text.DecimalFormat;
import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] nums = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double, Integer> counts = new TreeMap<>();

        for (double num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num) + 1);
        }

        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d\n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
