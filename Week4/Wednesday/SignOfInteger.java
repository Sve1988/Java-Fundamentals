package Week4.Wednesday;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n > 0){
            ispositive(n);
        }
        else if (n < 0){
            isNegative(n);
        }
        else {
            isZero(n);
        }
    }

    private static void isZero(int n) {
        System.out.printf("The number %d is zero.", n);
    }

    private static void isNegative(int n) {
        System.out.printf("The number %d is negative.", n);
    }

    private static void ispositive(int n) {
        System.out.printf("The number %d is positive.", n);
    }
}
