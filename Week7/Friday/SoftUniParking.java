package Week7.Friday;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        Map<String, String> inPark = new LinkedHashMap<>();

        for (int i = 0; i < numbers; i++) {
            String text = scanner.nextLine();
            String[] elements = text.split(" ");
            String type = elements[0];
            String name = elements[1];


            if(type.equals("register")){
                String plate = elements[2];
                if (inPark.containsKey(name)){
                    System.out.printf("ERROR: already registered with plate number %s%n", plate);
                }
                else {
                    inPark.put(name, plate);
                    System.out.printf("%s registered %s successfully%n", name, plate);
                }
            }
            else if (type.equals("unregister")){
                if (!inPark.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n", name);
                }
                else {
                    System.out.printf("%s unregistered successfully%n", name);
                    inPark.remove(name);
                }
            }
        }

        for (Map.Entry<String, String> entry : inPark.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
