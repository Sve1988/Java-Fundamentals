package Test;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> items = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        for (Integer item : items) {
            sum = sum + item;
        }
        double average = 1.0 * sum / items.size();
        List<Integer> above = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) > average){
                above.add(items.get(i));
            }
        }
        Collections.sort(above);
        Collections.reverse(above);

        if (above.isEmpty()){
            System.out.println("No");
        }
        else {
            List<Integer> finalArray = new ArrayList<>();
            if (above.size() >= 5){
                for (int i = 0; i < 5; i++) {
                    finalArray.add(above.get(i));
                }
            }
            else {
                for (int i = 0; i < above.size(); i++) {
                    finalArray.add(above.get(i));
                }
            }
            for (Integer integer : finalArray) {
                System.out.print(integer + " ");
            }
        }


    }
}
