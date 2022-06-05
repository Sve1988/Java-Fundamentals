package Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<Integer> items = Arrays.stream(text.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] elements = command.split(" ");
            if (elements[0].equals("swap")){
                int index1 = Integer.parseInt(elements[1]);
                int index2 = Integer.parseInt(elements[2]);
                int temp = items.get(index1);
                items.set(index1, items.get(index2));
                items.set(index2, temp);
            }
            else if (elements[0].equals("multiply")){
                int index1 = Integer.parseInt(elements[1]);
                int index2 = Integer.parseInt(elements[2]);
                items.set(index1, items.get(index1)*items.get(index2));
            }
            else if (elements[0].equals("decrease")){
                for (int i = 0; i < items.size(); i++) {
                    items.set(i, items.get(i)-1);
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < items.size()-1; i++) {
            System.out.print(items.get(i) + ", ");
        }
        System.out.println(items.get(items.size()-1));
    }
}
