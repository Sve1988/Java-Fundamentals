package Week1.Friday;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double total = 0;

        if (type.equals("Students")){
            if (day.equals("Friday")){
                price = 8.45;
            }
            else if (day.equals("Saturday")){
                price = 9.8;
            }
            else if (day.equals("Sunday")){
                price = 10.46;
            }
            if (people >= 30){
                total = price * people * 0.85;
            }
            else {
                total = price * people;
            }
        }

        if (type.equals("Business")){
            if (day.equals("Friday")){
                price = 10.9;
            }
            else if (day.equals("Saturday")){
                price = 15.6;
            }
            else if (day.equals("Sunday")){
                price = 16;
            }
            if (people >= 100){
                total = price * (people - 10);
            }
            else {
                total = price * people;
            }
        }
        if (type.equals("Regular")){
            if (day.equals("Friday")){
                price = 15;
            }
            else if (day.equals("Saturday")){
                price = 20;
            }
            else if (day.equals("Sunday")){
                price = 22.5;
            }
            if (people >= 10 && people <= 20){
                total = price * people * 0.95;
            }
            else {
                total = price * people;
            }
        }
        System.out.printf("Total price: %.2f", total);
    }
}
