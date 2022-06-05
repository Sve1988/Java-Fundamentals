package Week4.Wednesday;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int number1 = Math.abs(number);
        int sum = multiply(number1);
        System.out.println(sum);
    }

    private static int multiply(int number1) {

        int evenSum = 0;
        int oddSum = 0;

        while (number1 > 0){

            int digit = number1 % 10;
            if (digit % 2 == 0){
                oddSum = oddSum + digit;
            }
            else {
                evenSum = evenSum + digit;
            }
            number1 = number1 / 10;
        }
        return evenSum *oddSum;
    }
}
