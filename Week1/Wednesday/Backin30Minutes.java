package Week1.Wednesday;

import java.util.Scanner;

public class Backin30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        int total = 60 * hour + minute;
        int total1 = total + 30;

        int hour1 = total1 / 60;
        int min1 = total1 % 60;

        if (hour1 == 24){
            System.out.printf("0:%02d", min1);
        }
        else {
            System.out.printf("%d:%02d", hour1, min1);
        }
    }
}
