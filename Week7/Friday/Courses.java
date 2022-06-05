package Week7.Friday;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while(!text.equals("end")){
            String[] element = text.split(" : ");
            String course = element[0];
            String name = element[1];
            if(!courses.containsKey(course)){
                courses.put(course, new ArrayList<>());
            }
            courses.get(course).add(name);

            text = scanner.nextLine();
        }

        courses.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                    e.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(student -> System.out.println("-- " + student));
                });
    }
}
