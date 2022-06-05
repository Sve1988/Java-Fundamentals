package Week4.Wednesday;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double total = powerNumber(number, power);
        System.out.println(new DecimalFormat("0.####").format(powerNumber(number, power)));
    }

    private static double powerNumber(double number, int power) {
        double total = Math.pow(number, power);
        return total;
    }
}
