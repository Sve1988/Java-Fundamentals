package Week8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> list = Arrays.stream(text.split("")).map(String::trim).collect(Collectors.toList());
        for (int i = 0; i < list.size()-1; i++) {
            String symbol1 = list.get(i);
            String symbol2 = list.get(i + 1);
            if (symbol1.equals(symbol2)) {
                list.remove(i);
                i--;
            }
        }
        for (String s : list) {
            System.out.print(s);
        }
    }
}
