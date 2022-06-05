package Week4.Wednesday;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        String newText = newText(text,number);
        System.out.println(newText);
    }

    private static String newText(String text, int number) {
        String newWord = "";
        for (int i = 0; i < number; i++) {
            newWord = newWord + text;
        }
        return newWord;
    }
}
