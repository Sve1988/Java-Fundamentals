package FinalTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "([=/])(?<city>[A-Z][A-Za-z]{2,})\\1";
        List<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            list.add(matcher.group("city"));
        }

        String names = String.join(", ", list);
        System.out.println("Destinations: " + names);

        int sum = 0;
        for (String s : list) {
            int wordLength = s.length();
            sum = sum + wordLength;
        }
        System.out.printf("Travel Points: %d", sum);
    }
}
