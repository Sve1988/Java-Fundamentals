package Week8;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bannedWords = scanner.nextLine();
        String[] tokens = bannedWords.split(", ");
        String text = scanner.nextLine();
        for (int i = 0; i < tokens.length; i++) {
            if(text.contains(tokens[i])){
                int stars = tokens[i].length();
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < stars; j++) {
                    sb.append("*");
                }
                text = text.replace(tokens[i], sb);
            }
        }
        System.out.println(text);
    }
}
