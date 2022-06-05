package FinalTest.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "([=\\/])([A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> destination = new ArrayList<>();

        while (matcher.find()) {
            destination.add(matcher.group(2));
        }
        int sum = 0;
        for (int i = 0; i < destination.size(); i++) {
            String name = destination.get(i);
            sum = sum + name.length();
        }

            String names = String.join(", ", destination);
            System.out.println("Destinations: " + names);

        System.out.printf("Travel Points: %d", sum);
    }
}
