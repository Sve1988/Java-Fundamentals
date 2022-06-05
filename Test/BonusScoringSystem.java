package Test;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());
        int maxAttendance = 0;
        double bonusTake = 0;
        for (int i = 0; i < students; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            if (attendance > maxAttendance){
                maxAttendance = attendance;
                bonusTake = Math.ceil((1.0 * attendance / lectures) * (5 + bonus));
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", bonusTake);
        System.out.printf("The student has attended %d lectures.", maxAttendance);
    }
}
