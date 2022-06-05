package Week1.Additional;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double spent = 0;
        String input = scanner.nextLine();

        while (!input.equals("Game Time")) {
            if (input.equals("OutFall 4")) {
                price = 39.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                } else if (balance == price) {
                    System.out.println("Out of money");
                    return;
                } else {
                    System.out.println("Bought OutFall 4");
                    balance = balance - price;
                    spent = spent + price;
                    input = scanner.nextLine();
                }

            } else if (input.equals("CS: OG")) {
                price = 15.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                } else if (balance == price) {
                    System.out.println("Out of money");
                    return;
                } else {
                    System.out.println("Bought CS: OG");
                    balance = balance - price;
                    spent = spent + price;
                    input = scanner.nextLine();
                }
            } else if (input.equals("Zplinter Zell")) {
                price = 19.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                } else if (balance == price) {
                    System.out.println("Out of money");
                    return;
                } else {
                    System.out.println("Bought Zplinter Zell");
                    balance = balance - price;
                    spent = spent + price;
                    input = scanner.nextLine();
                }
            } else if (input.equals("Honored 2")) {
                price = 59.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                } else if (balance == price) {
                    System.out.println("Out of money");
                    return;
                } else {
                    System.out.println("Bought Honored 2");
                    balance = balance - price;
                    spent = spent + price;
                    input = scanner.nextLine();
                }
            } else if (input.equals("RoverWatch")) {
                price = 29.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                } else if (balance == price) {
                    System.out.println("Out of money");
                    return;
                } else {
                    System.out.println("Bought RoverWatch");
                    balance = balance - price;
                    spent = spent + price;
                    input = scanner.nextLine();
                }
            } else if (input.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                } else if (balance == price) {
                    System.out.println("Out of money");
                    return;
                } else {
                    System.out.println("Bought RoverWatch Origins Edition");
                    balance = balance - price;
                    spent = spent + price;
                    input = scanner.nextLine();
                }
            } else {
                System.out.println("Not found");
                input = scanner.nextLine();
            }
        }

        System.out.printf("Total spent: $%.2f. ", spent);
        System.out.printf("Remaining: $%.2f", balance);
    }
}
