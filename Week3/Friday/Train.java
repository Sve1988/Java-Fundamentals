package Week3.Friday;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array [i] = Integer.parseInt(scanner.nextLine());
            }
        for (int numbers : array) {
            System.out.print(numbers + " ");
            sum = sum + numbers;
        }
        System.out.println();
        System.out.println(sum);
    }
}
