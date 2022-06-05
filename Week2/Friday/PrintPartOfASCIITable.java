package Week2.Friday;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= last; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }
    }
}
