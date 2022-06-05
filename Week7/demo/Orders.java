package Week7.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while(!text.equals("buy")){
            String[] token = text.split(" ");
            String product = token[0];
            double price = Double.parseDouble(token[1]);
            int quantity = Integer.parseInt(token[2]);
            productPrice.put(product, price);

            if (!productQuantity.containsKey(product)){
                productQuantity.put(product, 0);
            }
            productQuantity.put(product, productQuantity.get(product) + quantity);

            text = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productPrice.entrySet()) {
            double price = entry.getValue() * productQuantity.get(entry.getKey());
            System.out.printf("%s -> %.2f%n", entry.getKey(), price);
        }
    }
}
