package Week3.Wednesday;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        int [] array = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            array [i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = numbers - 1; i >= 0; i--) {
            System.out.print(array [i] + " ");
        }
    }
}
