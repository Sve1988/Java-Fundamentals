package Week7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> cars = new LinkedHashMap<>();
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String text = scanner.nextLine();
            String[] token = text.split(" ");
            String command = token[0];
            String name = token[1];

            if (command.equals("register")){
                String plate = token[2];
                if (!cars.containsKey(name)){
                    cars.put(name, plate);
                    System.out.printf("%s registered %s successfully%n", name, plate);
                }
                else {
                    System.out.printf("ERROR: already registered with plate number %s%n", plate);
                }
            }
            else if (command.equals("unregister")){
                if (!cars.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n", name);
                }
                else {
                    System.out.printf("%s unregistered successfully%n", name);
                    cars.remove(name);
                }
            }

        }
        for (Map.Entry<String, String> entry : cars.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
