package Week7.Wednesday;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> list = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
        Map<String, Integer> words = new LinkedHashMap<>();
        for (String word : list) {
            String wordLowerCase = word.toLowerCase();
            if (!words.containsKey(wordLowerCase)){
                words.put(wordLowerCase, 0);
            }
            words.put(wordLowerCase, words.get(wordLowerCase) + 1);
        }
        List<String> odds = new ArrayList<>();
        for (Map.Entry<String,Integer> entry : words.entrySet()) {
            if (entry.getValue() % 2 == 1){
                odds.add(entry.getKey());
            }
        }

        for (int i = 0; i < odds.size() - 1; i++) {
            System.out.print(odds.get(i) + ", ");
        }
        System.out.println(odds.get(odds.size()-1));
    }
}
