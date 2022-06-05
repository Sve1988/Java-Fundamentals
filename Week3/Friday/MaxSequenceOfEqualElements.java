package Week3.Friday;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int maxCounter = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            int counter = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    counter++;
                }
                else {
                    break;
                }
                if (counter > maxCounter){
                    maxCounter = counter;
                    number = array[i];
                }
            }
        }
        for (int i = 0; i < maxCounter; i++) {
            System.out.print(number + " ");
        }
    }
}
