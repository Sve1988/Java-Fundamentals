package Week4.Wednesday;

import java.util.Scanner;


public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("int")){
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            int bigger = getMax(first, second);
            System.out.println(bigger);
        }
        else if (type.equals("char")){
            char first = scanner.nextLine().charAt(0);
            char second = scanner.nextLine().charAt(0);
            char bigger = getMax(first, second);
            System.out.println(bigger);
        }
        else if (type.equals("string")){
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            String bigger = getMax(first, second);
            System.out.println(bigger);
        }
    }

    private static int getMax(int first, int second) {
        if (first >= second){
            return first;
        }
        else {
            return second;
        }
    }

    private static char getMax(char first, char second) {
        int firstChar = (int) first;
        int secondChar = (int) second;
        if (firstChar >= secondChar) {
            return first;
        } else {
            return second;
        }
    }

    private static String getMax(String first, String second){
        if (first.compareTo(second) >= 0){
            return first;
        }
        else{
            return second;
        }
    }
}
