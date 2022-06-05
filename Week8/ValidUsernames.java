package Week8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split(", ");
        for (String word : words) {
            boolean flag1 = false;
            boolean flag2 = false;
            if (word.length() >= 3 && word.length() <= 16){
                flag1 = true;
            }

            for (int i = 0; i < word.length(); i++) {
                char symbol = word.charAt(i);
                if(Character.isAlphabetic(symbol) || Character.isDigit(symbol) || symbol == '-' || symbol == '_'){
                    flag2 = true;
                }
                else {
                    flag2 = false;
                    break;
                }
            }
            if (flag1 && flag2){
                System.out.println(word);
            }
        }
    }
}
