package Week2.Friday;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        double snowballValue = 0;
        double max = Double.MIN_VALUE;
        int snowballSnowWinner = 0;
        int snowballTimeWinner = 0;
        int snowballQualityWinner = 0;

        for (int i = 1; i <= count; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            snowballValue = 1.0 * Math.pow((1.0 * snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > max){
                max = snowballValue;
                snowballSnowWinner = snowballSnow;
                snowballTimeWinner = snowballTime;
                snowballQualityWinner = snowballQuality;
            }
        }

        System.out.printf("%s : %s = %.0f (%s)", snowballSnowWinner, snowballTimeWinner, max, snowballQualityWinner);
    }
}
