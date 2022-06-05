package Test;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        int efficiency = first + second + third;
        int time  = 0;

        while (students > 0){
            students = students - efficiency;
            time++;
            if (time % 4 == 0){
                time++;
            }
        }
        System.out.printf("Time needed: %dh.", time);
    }
}
