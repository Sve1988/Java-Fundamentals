package Week1.Friday;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceNuts = 2;
        double priceWater = 0.7;
        double priceCrisps = 1.5;
        double priceSoda = 0.8;
        double priceCoke = 1;
        double total = 0;

        String text = scanner.nextLine();

        while (!text.equals("Start")){
            double price = Double.parseDouble(text);

            if (price != 0.1 && price != 0.2 && price != 0.5 && price != 1 && price != 2){
                System.out.printf("Cannot accept %.2f", price);
                System.out.println();
                text = scanner.nextLine();
                continue;
            }

            total = total + price;
            text = scanner.nextLine();
        }

        String product = scanner.nextLine();

        while (!product.equals("End")){
            if (product.equals("Nuts")){
                if (total >= priceNuts) {
                    total = total - priceNuts;
                    System.out.printf("Purchased %s", product);
                    System.out.println();
                    product = scanner.nextLine();
                }
                else {
                    System.out.println("Sorry, not enough money");
                    product = scanner.nextLine();
                }
            }
            else if (product.equals("Water")){
                if (total >= priceWater) {
                    total = total - priceWater;
                    System.out.printf("Purchased %s", product);
                    System.out.println();
                    product = scanner.nextLine();
                }
                else {
                    System.out.println("Sorry, not enough money");
                    product = scanner.nextLine();
                }
            }
            else if (product.equals("Crisps")){
                if (total >= priceCrisps) {
                    total = total - priceCrisps;
                    System.out.printf("Purchased %s", product);
                    System.out.println();
                    product = scanner.nextLine();
                }
                else {
                    System.out.println("Sorry, not enough money");
                    product = scanner.nextLine();
                }
            }
            else if (product.equals("Soda")){
                if (total >= priceSoda) {
                    total = total - priceSoda;
                    System.out.printf("Purchased %s", product);
                    System.out.println();
                    product = scanner.nextLine();
                }
                else {
                    System.out.println("Sorry, not enough money");
                    product = scanner.nextLine();
                }
            }
            else if (product.equals("Coke")){
                if (total >= priceCoke) {
                    total = total - priceCoke;
                    System.out.printf("Purchased %s", product);
                    System.out.println();
                    product = scanner.nextLine();
                }
                else {
                    System.out.println("Sorry, not enough money");
                    product = scanner.nextLine();
                }
            }
            else {
                System.out.println("Invalid product");
                product = scanner.nextLine();
            }
        }

        System.out.printf("Change: %.2f", total);
    }
}
