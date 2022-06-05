package Week5.Friday;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<Integer> items = Arrays.stream(text.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int numbers = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] elements = command.split("\\s+");
            if (elements[0].equals("Add")){
                int people = Integer.parseInt(elements[1]);
                items.add(people);
            }
            else {
                int people = Integer.parseInt(elements[0]);
                for (int i = 0; i < items.size(); i++) {
                    if (people + items.get(i) <= numbers) {
                        items.set(i, people + items.get(i));
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (Integer item : items) {
            System.out.print(item + " ");
        }
    }
}
