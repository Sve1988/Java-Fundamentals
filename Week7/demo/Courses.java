package Week7.demo;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();
        String text = scanner.nextLine();
        while (!text.equals("end")){
            String[] token = text.split(" : ");
            String exam = token[0];
            String name = token[1];
            if (!courses.containsKey(exam)){
                courses.put(exam, new ArrayList<>());
            }
            courses.get(exam).add(name);

            text = scanner.nextLine();
        }

        courses.entrySet().stream()
                .sorted((e1,e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.printf("%s: %d%n", e.getKey(), e.getValue().size());
                    e.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(s -> System.out.println("-- " + s));
                });
    }
}
