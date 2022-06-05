package Week4.Friday;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number ; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
