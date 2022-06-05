package Week5.Friday;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<Integer> items = Arrays.stream(text.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] elements = command.split("\\s+");
            if (elements[0].equals("Delete")){
                int number = Integer.parseInt(elements[1]);
                for (int i = 0; i < items.size(); i++) {
                    if (number == items.get(i)){
                        items.remove(i);
                        i--;
                    }
                }
            }
            else if (elements[0].equals("Insert")){
                int element = Integer.parseInt(elements[1]);
                int position = Integer.parseInt(elements[2]);
                items.add(position, element);
            }
            command = scanner.nextLine();
        }

        for (Integer item : items) {
            System.out.print(item +" ");
        }
    }
}
