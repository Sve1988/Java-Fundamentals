package Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int currentIndex = 0;
        List<Integer> items = Arrays.stream(text.split("@+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Love!")) {
            String[] elements = command.split(" ");
            int jump = Integer.parseInt(elements[1]);
            if (currentIndex + jump >= items.size()) {
                currentIndex = 0;
                if (items.get(currentIndex) == 0) {
                    System.out.printf("Place %d already had Valentine's day.", currentIndex);
                    System.out.println();
                } else {
                    items.set(currentIndex, items.get(currentIndex) - 2);
                    if (items.get(currentIndex) == 0) {
                        System.out.printf("Place %d has Valentine's day.", currentIndex);
                        System.out.println();
                    }
                }
            } else {
                currentIndex = currentIndex + jump;
                if (items.get(currentIndex) == 0) {
                    System.out.printf("Place %d already had Valentine's day.", currentIndex);
                    System.out.println();
                } else {
                    items.set(currentIndex, items.get(currentIndex) - 2);
                    if (items.get(currentIndex) == 0) {
                        System.out.printf("Place %d has Valentine's day.", currentIndex);
                        System.out.println();
                    }
                }
            }
            command = scanner.nextLine();
        }

        int counter = 0;
        for (Integer item : items) {
            if (item > 0) {
                counter++;
            }
        }

        System.out.printf("Cupid's last position was %d.%n", currentIndex);

        if (counter == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", counter);
        }
    }
}
