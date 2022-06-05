package Week4.Wednesday;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 0;
        String text = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        if (text.equals("water")){
            printWaterPrice(price,quantity);
        }
        else if (text.equals("coffee")){
            printCoffeePrice(price,quantity);
        }
        else if (text.equals("coke")){
            printCokePrice(price,quantity);
        } else if (text.equals("snacks")) {
            printSnacksPrice(price,quantity);
        }
    }

    private static void printSnacksPrice(double price, int quantity) {
        price = 2;
        System.out.printf("%.2f", price * quantity);
    }

    private static void printCokePrice(double price, int quantity) {
        price = 1.4;
        System.out.printf("%.2f", price * quantity);
    }

    private static void printCoffeePrice(double price, int quantity) {
        price = 1.5;
        System.out.printf("%.2f", price * quantity);
    }

    private static void printWaterPrice(double price, int quantity) {
        price = 1;
        System.out.printf("%.2f", price * quantity);
    }
}
