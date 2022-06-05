package Week4.Friday;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int number = text.length();
        if (number % 2 == 1){
            char symbol = (char) text.charAt(number/2);
            System.out.println(symbol);
        }
        else {
            char symbol = (char) text.charAt(number/2-1);
            char symbol1 = (char) text.charAt(number/2);
            System.out.printf("%c%c", symbol,symbol1);
        }
    }
}
