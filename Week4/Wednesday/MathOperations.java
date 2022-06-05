package Week4.Wednesday;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String action = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        double result = calculate(a, action, b);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    private static double calculate(int a, String action, int b) {
        double result = 0;
        if (action.equals("+")){
            result = a + b;
        }
        else if (action.equals("-")){
            result = a - b;
        }
        else if (action.equals("*")){
            result = a * b;
        }
        else if (action.equals("/")){
            result = 1.0 * a/ b;
        }
        return result;
    }
}
