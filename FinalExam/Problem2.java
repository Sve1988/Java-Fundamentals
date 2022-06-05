package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "([\\*@])(?<names>([A-Z][a-z]{2,}))\\1: (?<chars>(\\[[A-Za-z]\\]\\|){3})$";
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()){
                String name = matcher.group("names");
                String letters = matcher.group("chars");
                String regex1 = "[A-Za-z]";
                Pattern pattern1 = Pattern.compile(regex1);
                Matcher matcher1 = pattern1.matcher(letters);

                while (matcher1.find()){
                    int symbol = matcher1.group().charAt(0);
                    list.add(symbol);
                }
                System.out.println(name + ": " + list.get(0) + " " + list.get(1) + " " + list.get(2));
            }
            else {
                System.out.println("Valid message not found!");
            }

        }
    }
}
