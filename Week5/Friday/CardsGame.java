package Week5.Friday;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        List<Integer> cards1 = Arrays.stream(text1.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String text2 = scanner.nextLine();
        List<Integer> cards2 = Arrays.stream(text2.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        while (cards1.size() > 0 && cards2.size() > 0) {
            if (cards1.get(0) > cards2.get(0)){
                cards1.add(cards1.get(0));
                cards1.add(cards2.get(0));
                cards1.remove(0);
                cards2.remove(0);
            }
            else if (cards1.get(0) < cards2.get(0)){
                cards2.add(cards2.get(0));
                cards2.add(cards1.get(0));
                cards1.remove(0);
                cards2.remove(0);
            }
            else {
                cards1.remove(cards1.get(0));
                cards2.remove(cards2.get(0));
            }
        }

        if (cards2.isEmpty()){
            int sum = 0;
            for (Integer integer : cards1) {
                sum = sum + integer;
            }
            System.out.println("First player wins! Sum: " + sum);
        }
        if (cards1.isEmpty()){
            int sum = 0;
            for (Integer integer : cards2) {
                sum = sum + integer;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}
