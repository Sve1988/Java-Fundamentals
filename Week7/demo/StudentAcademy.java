package Week7.demo;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> grades = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!grades.containsKey(name)){
                grades.put(name, new ArrayList<>());
            }
            grades.get(name).add(grade);
        }

        Map<String, Double> avGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : grades.entrySet()) {
            String name = entry.getKey();
            double avgrade = entry.getValue().stream().mapToDouble(e -> e).average().getAsDouble();
            if (avgrade >= 4.5){
                avGrade.put(name, avgrade);
            }
        }

        avGrade.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(grade -> {
                    System.out.printf("%s -> %.2f%n", grade.getKey(), grade.getValue());
                });

    }
}
