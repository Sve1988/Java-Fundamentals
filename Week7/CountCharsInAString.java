package Week7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol != ' '){
                if (!count.containsKey(symbol)){
                    count.put(symbol, 1);
                }
                else {
                    count.put(symbol, count.get(symbol) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : count.entrySet()) {
            System.out.println(characterIntegerEntry.getKey() + " -> " + characterIntegerEntry.getValue());
        }
    }
}
