package Week4.Friday;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int counter = 0;
            int digit = 0;
            int temp = i;
            while (temp > 0){
                int sumDigit = 0;
                sumDigit = temp % 10;
                if (sumDigit % 2 == 1){
                    counter++;
                }
                digit = digit + sumDigit;
                temp = temp / 10;
            }
            if ((digit % 8 == 0) && (counter > 0)){
                System.out.println(i);
            }
        }
    }
}
