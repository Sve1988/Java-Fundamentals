package Week4.Wednesday;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        if (grade >= 2.0 && grade < 3){
            isFail(grade);
        }
        else if (grade < 3.5){
            isPoor(grade);
        }
        else if (grade < 4.5){
            isGood(grade);
        }
        else if (grade < 5.5){
            isVeryGood(grade);
        }
        else if (grade <=6){
            isExcellent(grade);
        }
    }

    private static void isFail(double grade) {
        System.out.println("Fail");
    }

    private static void isPoor(double grade) {
        System.out.println("Poor");
    }

    private static void isGood(double grade) {
        System.out.println("Good");
    }

    private static void isVeryGood(double grade) {
        System.out.println("Very good");
    }

    private static void isExcellent(double grade) {
        System.out.println("Excellent");
    }
}
