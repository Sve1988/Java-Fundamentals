package Week7.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, Integer> resource = new LinkedHashMap<>();

        while (!text.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resource.containsKey(text)){
                resource.put(text, 0);
            }
            resource.put(text, resource.get(text) + quantity);

            text = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resource.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
