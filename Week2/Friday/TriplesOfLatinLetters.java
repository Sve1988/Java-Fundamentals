package Week2.Friday;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            char first = (char) ('a' + i);
             for (int j = 0; j < number; j++) {
                char second = (char) ('a' + j);
                for (int k = 0; k < number; k++) {
                    char third = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", first, second, third);
                }
            }
        }
    }
}
