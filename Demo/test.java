package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> list = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (String word : list) {
            for (int i = 0; i < word.length(); i++) {
                sb.append(word);
            }
        }
        System.out.println(sb.toString());
    }
}
