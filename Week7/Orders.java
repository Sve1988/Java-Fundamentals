package Week7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, Double> pricelist = new LinkedHashMap<>();
        Map<String, Integer> counter = new LinkedHashMap<>();
        while(!text.equals("buy")){
            String[] token = text.split(" ");
            String product = token[0];
            double price = Double.parseDouble(token[1]);
            int quantity = Integer.parseInt(token[2]);
            pricelist.put(product, price);
            if (!counter.containsKey(product)){
                counter.put(product, quantity);
            }
            else {
                counter.put(product, counter.get(product) + quantity);
            }

            text = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            String product = entry.getKey();
            double finalPrice = entry.getValue() * pricelist.get(product);
            System.out.printf("%s -> %.2f%n", product, finalPrice);
        }
    }
}
