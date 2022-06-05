package Week4.Friday;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        double sum1 = 1;
        double sum2 = 1;

        for (int i = 1; i <= a; i++) {
            sum1 = sum1 * i;
        }
        for (int i = 1; i <= b; i++) {
            sum2 = sum2 * i;
        }
        System.out.printf("%.2f", sum1 / sum2);
    }
}
