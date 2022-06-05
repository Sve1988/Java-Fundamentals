package Week5.Wednesday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 0; i < numbers; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }
        Collections.sort(products);

        for (int i = 1; i <= numbers; i++) {
            System.out.println((i)+"."+products.get(i-1));
        }
    }
}
