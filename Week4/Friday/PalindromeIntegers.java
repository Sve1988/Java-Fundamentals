package Week4.Friday;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")){
            boolean flag = true;
            int number = Integer.parseInt(input);
            String text = "" + number;
            for (int i = 0; i < text.length() / 2 ; i++) {
                char symbol1 = text.charAt(i);
                char symbol2 = text.charAt(text.length() - 1 - i);
                if (symbol1 != symbol2){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
            input =scanner.nextLine();
        }
    }
}
