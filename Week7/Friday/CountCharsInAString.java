package Week7.Friday;

import java.util.*;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Character, Integer> word = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol != ' ') {
                if (!word.containsKey(symbol)) {
                    word.put(symbol, 0);
                }
                word.put(symbol, word.get(symbol) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : word.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
