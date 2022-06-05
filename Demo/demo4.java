package Demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Map<String, Double> sumGrades = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        for (int i = 0; i < number; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!sumGrades.containsKey(name)){
                sumGrades.put(name, grade);
                count.put(name, 1);
            }
            else {
                sumGrades.put(name, sumGrades.get(name) + grade);
                count.put(name, count.get(name) + 1);
            }
        }

        Map<String, Double> avGrades = new LinkedHashMap<>();

        for (Map.Entry<String, Double> entry : sumGrades.entrySet()) {
            String name = entry.getKey();
            double grade = entry.getValue() / count.get(name);
            if (grade >= 4.5) {
                avGrades.put(name, grade);
            }
        }

        avGrades.entrySet().stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> {
                    System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue());
                 //   System.out.println(e.getKey() + " -> " + e.getValue());
                });

    }
}
