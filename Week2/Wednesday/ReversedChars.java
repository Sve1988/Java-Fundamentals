package Week2.Wednesday;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a1 = scanner.nextLine().charAt(0);
        char a2 = scanner.nextLine().charAt(0);
        char a3 = scanner.nextLine().charAt(0);
        System.out.printf("%c %c %c", a3, a2, a1);
    }
}
