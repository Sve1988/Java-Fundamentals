package Week3.Wednesday;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        int[] array = new int[elements.length];
        for (int i = 0; i < array.length; i++) {
            array [i] = Integer.parseInt(elements [i]);
        }
        int evenSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] % 2 == 0){
                evenSum = evenSum + array [i];
            }
        }
        System.out.println(evenSum);
    }
}
