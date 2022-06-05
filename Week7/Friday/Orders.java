package Week7.Friday;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!text.equals("buy")) {
            String[] elements = text.split(" ");
            String product = elements[0];
            double price = Double.parseDouble(elements[1]);
            int quantity = Integer.parseInt(elements[2]);

            productPrice.put(product, price);

            if(!productQuantity.containsKey(product)){
                productQuantity.put(product, 0);
            }
            productQuantity.put(product, productQuantity.get(product) + quantity);

            text = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productPrice.entrySet()) {
            double totalPrice = entry.getValue() * productQuantity.get(entry.getKey());
            System.out.printf("%s -> %.2f%n", entry.getKey(), totalPrice);
        }

    }
}
