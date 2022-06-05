package Week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<Integer> items = Arrays.stream(text.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < items.size(); i++) {
            int sum = 0;
            for (int j = i + 1; j < items.size(); j++) {
                sum = items.get(i) + items.get(j);
                if (sum == number){
                    System.out.println(items.get(i) + " " + items.get(j));
                }
            }
        }

    }
}

