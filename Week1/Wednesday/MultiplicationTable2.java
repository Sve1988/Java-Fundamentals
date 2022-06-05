package Week1.Wednesday;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d", number, time, number*time);
            System.out.println();
            time++;
        } while (time <=10);

    }
}
