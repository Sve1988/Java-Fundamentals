package Week8;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            char newSymbol = (char)(symbol + 3);
            sb.append(newSymbol);
        }
        System.out.println(sb.toString());
    }
}
