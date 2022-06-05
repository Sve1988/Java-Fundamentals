package Week2.Wednesday;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String sign = scanner.nextLine();
        System.out.println(firstName + sign + lastName);
    }
}
