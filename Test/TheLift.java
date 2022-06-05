package Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        List<Integer> items = Arrays.stream(text.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < items.size(); i++) {
            int free = 4 - items.get(i);
            if (people < free){
                items.set(i, people);
                people = 0;
                System.out.println("The lift has empty spots!");

                break;
            }
            else if (people == free) {
                items.set(i, people);
                people = 0;

            }
            else {
                items.set(i, 4);
                people = people - free;
            }
        }
        if (people > 0){
            System.out.printf("There isn't enough space! %d people in a queue!", people);
            System.out.println();
            for (Integer item : items) {
                System.out.print(item + " ");
            }
        }
        else if (people == 0){
            for (Integer item : items) {
                System.out.print(item + " ");
            }
        }
    }
}
