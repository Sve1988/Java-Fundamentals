package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> pairs = new ArrayList<>();
        String text = scanner.nextLine();
        String regex = "([@#])([A-Za-z]{3,})\\1{2}([A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
            String firstWord = matcher.group(2);
            String secondWord = matcher.group(3);
            StringBuilder sb = new StringBuilder(secondWord);
            sb.reverse();
            String temp = sb.toString();
            if (firstWord.equals(temp)) {
                String all = firstWord + " <=> " + secondWord;
                pairs.add(all);
            }
        }
        if (count == 0){
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }
        else {
            System.out.printf("%d word pairs found!%n",count);
            if (pairs.isEmpty()){
                System.out.println("No mirror words!");
            }
            else {
                System.out.println("The mirror words are:");
                System.out.println(String.join(", ", pairs));
            }
        }
    }
}
