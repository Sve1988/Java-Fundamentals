package Week2.Friday;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int sum = 0;
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (capacity < quantity){
                System.out.println("Insufficient capacity!");
            }
            else {
                capacity = capacity - quantity;
                sum = sum + quantity;
            }
        }
        System.out.println(sum);
    }
}
