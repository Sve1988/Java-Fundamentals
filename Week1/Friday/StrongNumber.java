package Week1.Friday;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int number1 = number;
        int sum = 0;

        while (number != 0){
            int digit = number % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            number = number / 10;
        }

        if (number1 == sum){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
