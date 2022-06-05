package Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<Integer> items = Arrays.stream(text.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        int count = 0;

        while (!command.equals("End")){
            int index = Integer.parseInt(command);
            if (index >= 0 && index < items.size()){
                count++;
                int temp = items.get(index);
                items.set(index, -1);
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i) != -1){

                        if (items.get(i) > temp){
                            items.set(i, items.get(i) - temp);
                        }
                        else if (items.get(i) <= temp){
                            items.set(i, items.get(i) + temp);
                        }
                    }
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
        for (Integer item : items) {
            System.out.print(item + " ");
        }
    }
}
