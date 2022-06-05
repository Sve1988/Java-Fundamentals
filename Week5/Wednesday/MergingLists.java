package Week5.Wednesday;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        List<Integer> numbers1 = Arrays.stream(text1.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers2 = Arrays.stream(text2.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int row = Math.min(numbers1.size(), numbers2.size());
            for (int i = 0; i < row; i++) {
                System.out.print(numbers1.get(i) + " " + numbers2.get(i) + " ");
        }
            if (numbers1.size() >= numbers2.size()){
                for (int i = row; i < numbers1.size(); i++) {
                    System.out.print(numbers1.get(i) + " ");
                }
            }
            else {
                for (int i = row; i < numbers2.size(); i++) {
                    System.out.print(numbers2.get(i) + " ");
                }
            }
    }
}
