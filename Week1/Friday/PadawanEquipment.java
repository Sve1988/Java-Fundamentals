package Week1.Friday;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double ligthsaberCount = Math.ceil(students * 1.1);
        int beltCount = students - (students / 6);

        double total = ligthsaberCount * lightsaberPrice + robePrice * students + beltCount * beltPrice;

        if (amount >= total){
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        }
        else {
            System.out.printf("Ivan Cho will need %.2flv more.", total-amount);
        }
    }
}
