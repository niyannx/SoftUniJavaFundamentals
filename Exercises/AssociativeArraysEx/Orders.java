package Exercises.AssociativeArraysEx;

/*
Write a program, which keeps information about products and their prices. Each product has a name, a price and its
quantity. If the product doesn't exist yet, add it with its starting quantity.
If you receive a product, which already exists, increase its quantity by the input quantity and if its price is different,
replace the price as well.
You will receive products' names, prices and quantities on new lines. Until you receive the command &quot;buy&quot;, keep
adding items. When you do receive the command &quot;buy&quot;, print the items with their names and total price of all the
products with that name.
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap <String, Double> productsPrice = new LinkedHashMap<>();
        LinkedHashMap <String, Integer> productsQuantity = new LinkedHashMap<>();

        String input = scan.nextLine();

        while(!input.equals("buy")) {
            String product = input.split(" ")[0];
            double pricePerProduct = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            productsPrice.put(product, pricePerProduct);

            if (!productsQuantity.containsKey(product)) {
                productsQuantity.put(product, quantity);
            } else {
                productsQuantity.put(product, productsQuantity.get(product) + quantity);
            }

            input = scan.nextLine();
        }

        for (Map.Entry<String, Double> entry : productsPrice.entrySet()) {
            String productName = entry.getKey();
            double finalSum = entry.getValue() * productsQuantity.get(productName);

            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
