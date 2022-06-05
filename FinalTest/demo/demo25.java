package FinalTest.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexText = "([*:]{2})([A-Z][a-z]{2,})\\1";
        String regexNumber = "\\d";
        String text = scanner.nextLine();
        List<Integer> nums = new ArrayList<>();
        List<String> winners = new ArrayList<>();
        Pattern pattern = Pattern.compile(regexNumber);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            nums.add(Integer.parseInt(matcher.group()));
        }
        long sum = 1;
        for (int i = 0; i < nums.size(); i++) {
            sum = sum * nums.get(i);
        }

        System.out.printf("Cool threshold: %d%n", sum);

        Pattern pattern1 = Pattern.compile(regexText);
        Matcher matcher1 = pattern1.matcher(text);
        int count = 0;

        while (matcher1.find()){
            count++;
            String emoji = matcher1.group(2);
            String fullName = matcher1.group();
            long coolness = 0;
            for (int i = 0; i < emoji.length(); i++) {
                coolness = coolness + emoji.charAt(i);
            }
            if (coolness > sum){
                winners.add(fullName);
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", count);

        for (int i = 0; i < winners.size(); i++) {
            System.out.println(winners.get(i));
        }
    }
}
