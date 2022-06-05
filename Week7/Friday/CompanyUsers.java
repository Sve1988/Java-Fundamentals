package Week7.Friday;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, List<String>> plates = new TreeMap<>();

        while (!text.equals("End")) {
            String[] element = text.split(" -> ");
            String company = element[0];
            String id = element[1];
            if(!plates.containsKey(company)){
                plates.put(company, new ArrayList<>());
            }
            if (!plates.get(company).contains(id)) {
                plates.get(company).add(id);
            }

            text = scanner.nextLine();
        }

        plates.entrySet().stream()
                .forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue().stream()
                         //   .sorted(String::compareTo)
                            .forEach(plate -> System.out.println("-- " + plate));
                });
    }
}

