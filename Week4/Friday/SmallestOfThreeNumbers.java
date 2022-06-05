package Week4.Friday;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(maxNumber(a, b, c));

    }
        static int maxNumber(int a, int b, int c){
            if (a <= b && a <= c){
                return a;
            }
            else if (b <= a && b <= c){
                return b;
            }
            else {
                return c;
            }
        }
}
