package FinalTest.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> item = new ArrayList<>();
        List<String> date = new ArrayList<>();
        List<Integer> calories = new ArrayList<>();
        String text = scanner.nextLine();
        String regex = "([\\|#])([A-Za-z\\s+]+)\\1([0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1([0-9]{1,5})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            item.add(matcher.group(2));
            date.add(matcher.group(3));
            calories.add(Integer.parseInt(matcher.group(4)));
        }

        int sum = 0;
        for (Integer calory : calories) {
            sum = sum + calory;
        }

        System.out.printf("You have food to last you for: %d days!%n", (sum/2000));

        for (int i = 0; i < item.size(); i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", item.get(i), date.get(i), calories.get(i));
        }
    }
}
