package Week2.Wednesday;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int sum = 0;
            int i1 = i;
            while (i1 > 0) {
                int digit = i1 % 10;
                sum = sum + digit;
                i1 = i1 / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True", i);
                System.out.println();
            } else {
                System.out.printf("%d -> False", i);
                System.out.println();
            }
        }
    }
}
