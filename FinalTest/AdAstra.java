package FinalTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "([|#])(?<name>[A-Za-z\\s]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1";
        String text = scanner.nextLine();
        List<String> name = new ArrayList<>();
        List<String> date = new ArrayList<>();
        List<Integer> calories = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int sum = 0;

        while(matcher.find()){
           
            name.add(matcher.group("name"));
            date.add(matcher.group("date"));
            calories.add(Integer.parseInt(matcher.group("calories")));
            sum = sum + Integer.parseInt(matcher.group("calories"));
        }
        int days = sum / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        for (int i = 0; i < name.size(); i++) {
            System.out.printf("Item: %s, ", name.get(i));
            System.out.printf("Best before: %s, ", date.get(i));
            System.out.printf("Nutrition: %d", calories.get(i));
            System.out.println();
        }
    }
}
