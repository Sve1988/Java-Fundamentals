package Week3.Friday;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println(array[array.length-1]);
    }
}
