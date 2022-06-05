package Week4.Wednesday;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if (text.equals("add")){
            addIntegers(a,b);
        }
        else if (text.equals("subtract")){
            subtractIntegers(a,b);
        }
        else if (text.equals("multiply")){
            multiplyIntegers(a,b);
        }
        else if (text.equals("divide")){
            divideIntegers(a,b);
        }
    }

    private static void addIntegers(int a, int b) {
        System.out.println(a + b);
    }

    private static void subtractIntegers(int a, int b) {
        System.out.println(a - b);
    }

    private static void multiplyIntegers(int a, int b) {
        System.out.println(a * b);
    }

    private static void divideIntegers(int a, int b) {
        System.out.println(a / b);
    }
}
