package Week1.Friday;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
