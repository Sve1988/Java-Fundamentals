package Week2.Wednesday;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);
        int a = (int) symbol;

        if (a >= 65 && a <= 90){
            System.out.println("upper-case");
        }
        else if (a >= 97 && a <= 122){
            System.out.println("lower-case");
        }
    }
}
