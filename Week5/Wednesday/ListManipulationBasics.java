package Week5.Wednesday;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<Integer> items = Arrays.stream(text.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] elements = command.split("\\s+");
            if (elements[0].equals("Add")){
                int number = Integer.parseInt(elements[1]);
                items.add(number);
            }
            else if (elements[0].equals("Remove")){
                int number = Integer.parseInt(elements[1]);
                items.remove(Integer.valueOf(number));
            }
            else if (elements[0].equals("RemoveAt")){
                int number = Integer.parseInt(elements[1]);
                items.remove(number);
            }
            else if (elements[0].equals("Insert")){
                int number = Integer.parseInt(elements[1]);
                int index = Integer.parseInt(elements[2]);
                items.add(index, number);
            }

            command = scanner.nextLine();
        }

        for (Integer item : items) {
            System.out.print(item + " ");
        }
    }
}
