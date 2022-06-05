package FinalTest.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "([@#])([A-Za-z]{3,})\\1\\1([A-Za-z]{3,})\\1";
        List<String> name1 = new ArrayList<>();
        List<String> name2 = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            name1.add(matcher.group(2));
            name2.add(matcher.group(3));
        }

        if (name1.size() == 0){
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }
        else {
            List<String> name3 = new ArrayList<>();
            System.out.printf("%d word pairs found!%n", name1.size());

            for (int i = 0; i < name2.size(); i++) {
                StringBuilder sb = new StringBuilder(name2.get(i));
                sb.reverse();
                String word = sb.toString();
                if (name1.get(i).equals(word)){
                    String text1 = name1.get(i) + " <=> " + name2.get(i);
                    name3.add(text1);

                }
            }
            if (name3.size() == 0){
                System.out.println("No mirror words!");
            }
            else {
                System.out.println("The mirror words are:");
                String words = String.join(", ", name3);
                System.out.println(words);
            }
        }
    }
}
