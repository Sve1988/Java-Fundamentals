package Test2702;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double total = 0;
        for (int i = 1; i <= number; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsule = Integer.parseInt(scanner.nextLine());
            double dayPrice = price * days * capsule;
            System.out.printf("The price for the coffee is: $%.2f%n", dayPrice);
            total = total + dayPrice;
        }
        System.out.printf("Total: $%.2f",total);
    }
}
