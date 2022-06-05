package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            String[] elements = text.split(" ");
            int number1 = Integer.parseInt(elements[0]);
            int number2 = Integer.parseInt(elements[1]);

            if (i % 2 == 0){
                array1[i] = number1;
                array2[i] = number2;
            }
            else {
                array1[i] = number2;
                array2[i] = number1;
            }
        }
        for (int i : array1) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : array2) {
            System.out.print(i +" ");
        }
    }
}
