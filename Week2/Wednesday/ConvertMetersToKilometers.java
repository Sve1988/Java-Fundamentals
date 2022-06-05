package Week2.Wednesday;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        double output = 1.0 * input / 1000;
        System.out.printf("%.2f", output);
    }
}
