package Week8;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] elements = text.split(" ");
        int totalSum = 0;
        if (elements[0].length() >= elements[1].length()) {

            for (int i = 0; i < elements[1].length(); i++) {
                char symbol1 = elements[0].charAt(i);
                char symbol2 = elements[1].charAt(i);
                int sum = symbol1 * symbol2;
                totalSum = totalSum + sum;
            }

            for (int i = elements[1].length(); i < elements[0].length(); i++) {
                char symbol = elements[0].charAt(i);
                totalSum = totalSum + symbol;
            }
        }

        else {
            for (int i = 0; i < elements[0].length(); i++) {
                char symbol1 = elements[0].charAt(i);
                char symbol2 = elements[1].charAt(i);
                int sum = symbol1 * symbol2;
                totalSum = totalSum + sum;
            }

            for (int i = elements[0].length(); i < elements[1].length(); i++) {
                char symbol = elements[1].charAt(i);
                totalSum = totalSum + symbol;
            }
        }
        System.out.println(totalSum);
    }
}
