package Week1.Additional;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder newWord = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            char symbol = input.charAt(i);
            newWord.append(symbol);
        }
        String newWords = newWord.toString();
        System.out.println(newWords);
    }
}
