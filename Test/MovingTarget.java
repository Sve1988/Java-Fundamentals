package Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> items = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] element = command.split(" ");
            if (element[0].equals("Shoot")) {
                int index = Integer.parseInt(element[1]);
                int power = Integer.parseInt(element[2]);
                if (index > 0 || index < items.size() - 1) {
                    if (items.get(index) - power > 0) {
                        items.set(index, items.get(index) - power);
                    } else {
                        items.remove(index);
                    }
                }
            } else if (element[0].equals("Add")) {
                int index = Integer.parseInt(element[1]);
                int value = Integer.parseInt(element[2]);
                if (index < 0 || index > items.size() - 1) {
                    System.out.println("Invalid placement!");
                } else {
                    items.add(index, value);
                }
            } else if (element[0].equals("Strike")) {
                int index = Integer.parseInt(element[1]);
                int radius = Integer.parseInt(element[2]);
                if (index - radius < 0 || index + radius > items.size() - 1) {
                    System.out.println("Strike missed!");
                } else {
                    for (int i = index - radius; i <= index + radius; i++) {
                        items.set(i, -1);
                    }
                    for (int i = 0; i < items.size() - 1; i++) {
                        if (items.get(i) == -1) {
                            items.remove(i);
                            i--;
                        }
                    }
                }
            }

            command = scanner.nextLine();
        }
            for (int i = 0; i < items.size() - 1; i++) {
                System.out.print(items.get(i) + "|");
            }
            System.out.println(items.get(items.size() - 1));

            

    }
}
