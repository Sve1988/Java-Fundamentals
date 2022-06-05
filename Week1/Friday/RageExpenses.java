package Week1.Friday;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int lostHeadset = lostGame / 2;
        int lostMouse = lostGame / 3;
        int lostKeyboard = lostGame / 6;
        int lostDisplay = lostGame / 12;

        double total = headsetPrice * lostHeadset + mousePrice * lostMouse + keyboardPrice * lostKeyboard + displayPrice * lostDisplay;

        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
