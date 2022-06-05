package Week7.Friday;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, Integer> products = new LinkedHashMap<>();
        while (!text.equals("stop")){
            String resource = text;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!products.containsKey(resource)){
                products.put(resource, 0);
            }
            products.put(resource, products.get(resource) + quantity);

            text = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
