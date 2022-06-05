package Week8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> words = Arrays.stream(text.split("\\s+")).map(String::trim).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                sb.append(word);
            }
        }
        System.out.println(sb.toString());
    }
}
