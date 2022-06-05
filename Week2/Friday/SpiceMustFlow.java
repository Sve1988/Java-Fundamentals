package Week2.Friday;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spice = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int crew = 26;
        int totalSpice = 0;

        if (spice >= 100) {
            while (spice >= 100) {
                days++;
                totalSpice = totalSpice + spice - crew;
                spice = spice - 10;
            }
            totalSpice = totalSpice - 26;

        }
        System.out.println(days);
        System.out.println(totalSpice);
    }
}
