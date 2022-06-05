package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] items = command.split(" ");
            if (items[0].equals("Urgent")) {
                String product = items[1];
                if(!products.contains(product)){
                    products.add(0, product);
                }
            }
            else if (items[0].equals("Unnecessary")){
                String product = items[1];
               if (products.contains(product)){
                   products.remove(product);
               }
            }
            else if (items[0].equals("Correct")){
                String oldItem = items[1];
                String newItem = items[2];
                if (products.contains(oldItem)){
                    products.set(products.indexOf(oldItem), newItem);
                }
            }
            else if (items[0].equals("Rearrange")){
                String product = items[1];
                if (products.contains(product)) {
                    int index = products.indexOf(product);
                    products.remove(product);
                    products.add(product);
                }
            }
            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", products));
    }
}
