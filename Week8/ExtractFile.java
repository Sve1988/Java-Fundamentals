package Week8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> words = Arrays.stream(text.split("\\\\")).map(String::trim).collect(Collectors.toList());
        String word = words.get(words.size() - 1);
        String[] path = word.split("\\.");
        String filename = path[0];
        String extension = path[1];
        System.out.printf("File name: %s%n", filename);
        System.out.printf("File extension: %s", extension);
    }
}
