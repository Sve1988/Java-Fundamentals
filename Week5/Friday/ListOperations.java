package Week5.Friday;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<Integer> items = Arrays.stream(text.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] elements = command.split("\\s+");
            if (elements[0].equals("Add")){
                int number = Integer.parseInt(elements[1]);
                items.add(number);
            }
            else if (elements[0].equals("Insert")){
                int number = Integer.parseInt(elements[1]);
                int index = Integer.parseInt(elements[2]);
                if (index < 0 || index >= items.size()){
                    System.out.println("Invalid index");
                }
                items.add(index, number);
            }
            else if (elements[0].equals("Remove")){
                int index = Integer.parseInt(elements[1]);
                if (index < 0 || index >= items.size()){
                    System.out.println("Invalid index");
                }
                else {
                    items.remove(index);
                }
            }
            else if (elements[0].equals("Shift") && elements[1].equals("left")){
                int count = Integer.parseInt(elements[2]);
                for (int i = 0; i < count; i++) {
                    items.add(items.get(0));
                    items.remove(0);
                }
            }
            else if (elements[0].equals("Shift") && elements[1].equals("right")){
                int count = Integer.parseInt(elements[2]);
                for (int i = 0; i < count; i++) {
                    items.add(0, items.get(items.size() - 1));
                    items.remove(items.size() - 1);
                }
            }

            command = scanner.nextLine();
        }

        for (Integer item : items) {
            System.out.print(item + " ");
        }
    }
}
