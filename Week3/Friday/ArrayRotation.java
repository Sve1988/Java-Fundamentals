package Week3.Friday;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = Arrays.stream(scanner.nextLine().split(" "))
        	                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        for (int index : arr) {
            System.out.print(index + " ");
        }
    }
}
