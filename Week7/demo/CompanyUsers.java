package Week7.demo;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, List<String>> cars = new TreeMap<>();

        while (!text.equals("End")) {
            String[] token = text.split(" -> ");
            String company = token[0];
            String id = token[1];
            if (!cars.containsKey(company)){
                cars.put(company,new ArrayList<>());
            }
            if (!cars.get(company).contains(id)){
                cars.get(company).add(id);
            }

            text = scanner.nextLine();
        }

        cars.entrySet().stream()
                .forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue().stream()
                            .forEach(el -> System.out.println("-- " + el));
                });
    }
}
