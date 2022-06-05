package Week3.Wednesday;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] elements = input.split(" ");

        for (int i = 0; i < elements.length / 2; i++) {
            String newText = elements [i];
            elements [i] = elements [elements.length - 1 - i];
            elements [elements.length - 1 - i] = newText;
        }
        System.out.println(String.join(" ", elements));
    }
}
