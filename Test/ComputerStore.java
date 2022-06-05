package Test;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        double tax = 0;
        double totalSum = 0;
        while(!input.equals("special") && !input.equals("regular")){
            double price = Double.parseDouble(input);
            if (price < 0){
                System.out.println("Invalid price!");
                price = 0;
            }
            sum = sum + price;
            tax = 0.2 * sum;
            totalSum = sum + tax;
            input = scanner.nextLine();
            if (input.equals("special")){
                totalSum = totalSum * 0.9;
            }
        }
        if (totalSum == 0){
            System.out.println("Invalid order!");
        }
        else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$", sum);
            System.out.println();
            System.out.printf("Taxes: %.2f$", tax);
            System.out.println();
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalSum);
        }
    }
}
