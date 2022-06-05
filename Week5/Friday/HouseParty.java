package Week5.Friday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        List<String> people = new ArrayList<>();
        for (int i = 0; i < numbers; i++) {
            String text = scanner.nextLine();
            String[] elements = text.split("\\s+");
            String name = elements[0];
            String status = elements[2];
            if (status.equals("going!")) {
                if (people.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    people.add(name);
                }
            } else if (status.equals("not")) {
                if (!people.contains(name)) {
                    System.out.println(name + " is not in the list!");
                } else {
                    people.remove(name);
                }
            }
        }
        for (String person : people) {
            System.out.println(person);
        }
    }
}
