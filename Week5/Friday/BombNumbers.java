package Week5.Friday;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<Integer> items = Arrays.stream(text.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String text1 = scanner.nextLine();

        String[] elements = text1.split("\\s+");
        int bombNumber = Integer.parseInt(elements[0]);
        int count = Integer.parseInt(elements[1]);
        for (int i = 0; i < items.size(); i++) {
            if (bombNumber == items.get(i)){

                for (int j = 0; j < count; j++) {
                    if (i -j - 1 < 0){
                        break;
                    }
                    else {
                        items.set(i - j - 1, 0);
                    }
                }
                for (int j = 0; j < count; j++) {
                    if (i + j + 1 > items.size() - 1){
                        break;
                    }
                    else {
                        items.set(i + j + 1, 0);
                    }
                }

                items.set(i, 0);
            }
        }
        int sum = 0;
        for (Integer item : items) {

            sum = sum + item;
        }
        System.out.println(sum);
    }
}
