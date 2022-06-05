package Week5.Wednesday;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<Integer> items = Arrays.stream(text.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) < 0) {
                items.remove(i);
                i--;
            }
        }

        Collections.reverse(items);

        if (items.isEmpty()) {
            System.out.println("empty");
        } else {

            for (Integer item : items) {
                System.out.print(item + " ");
            }
        }
    }
}
