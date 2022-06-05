package Week3.Wednesday;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        int[] array = new int[elements.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                array[j] = array[j]+array[j+1];
            }
        }

        System.out.println(array[0]);
    }
}
