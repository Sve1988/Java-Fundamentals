package Week9;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> list = Arrays.stream(text.split(", ")).map(String::trim).collect(Collectors.toList());
        String regexWord = "[A-Za-z]";
        String regex1 = "[0-9]";
        Map<String,Integer> map = new HashMap<>();
        String input = scanner.nextLine();

        while(!input.equals("end of race")){
            Pattern pattern = Pattern.compile(regexWord);
            Matcher matcher = pattern.matcher(input);
            StringBuilder sb = new StringBuilder();
            while(matcher.find()) {
                sb.append(matcher.group(0));
            }
            String name = sb.toString();
            int sum = 0;
            Pattern pattern1 = Pattern.compile(regex1);
            Matcher matcher1 = pattern1.matcher(input);

            while(matcher1.find()){
                int number = Integer.parseInt(matcher1.group());
                sum = sum + number;
            }

            if (list.contains(name)){
                if(!map.containsKey(name)) {
                    map.put(name, 0);
                }
                map.put(name, map.get(name) + sum);
            }

            input = scanner.nextLine();
        }

        List<String> firstThree = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("1st place: " + firstThree.get(0));
        System.out.println("2nd place: " + firstThree.get(1));
        System.out.println("3rd place: " + firstThree.get(2));
    }
}
