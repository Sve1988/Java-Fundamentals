package Week2.Friday;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String winner = "";
        double big = -1;
        for (int i = 1; i <= number; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * radius * radius * height;

            if (volume > big){
                winner = model;
                big = volume;
            }
        }
        System.out.println(winner);
    }
}
