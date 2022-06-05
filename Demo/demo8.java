package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "([#@])(?<name1>[A-Za-z]{3,})\\1{2}(?<name2>[A-Za-z]{3,})\\1";
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int count = 0;

        while (matcher.find()) {
            count++;
            String name1 = matcher.group("name1");
            String name2 = matcher.group("name2");
            StringBuilder sb = new StringBuilder(name2);
            sb.reverse();
            String temp = sb.toString();
            if (name1.equals(temp)) {
                list.add(name1);
                list1.add(name2);
            }
        }
        if (count == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", count);
        }
        if (list.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.printf("%s <=> %s, ", list.get(i), list1.get(i));
            }
            System.out.printf("%s <=> %s", list.get(list.size() - 1), list1.get(list1.size() - 1));
        }
    }
}
