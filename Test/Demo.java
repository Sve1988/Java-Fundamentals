package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split("\\>")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scanner.nextLine().split("\\>")).map(Integer::parseInt).collect(Collectors.toList());
        int health = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        String command = scanner.nextLine();

        while(!command.equals("Retire")){
            String[] token = command.split(" ");
            String text = token[0];
            if (text.equals("Fire")){
                int index = Integer.parseInt(token[1]);
                int damage = Integer.parseInt(token[2]);
                if (index >= 0 && index < warShip.size()){
                    warShip.set(index, warShip.get(index) - damage);
                    if (warShip.get(index) <= 0){
                        System.out.println("You won! The enemy ship has sunken.");
                        flag = false;
                        break;
                    }
                }
            }

            else if (text.equals("Defend")){
                int startIndex = Integer.parseInt(token[1]);
                int endIndex = Integer.parseInt(token[2]);
                int damage = Integer.parseInt(token[3]);
                if ((startIndex >= 0 && startIndex < pirateShip.size()) && (endIndex >= 0 && endIndex < pirateShip.size())){
                    for (int i = startIndex; i <= endIndex ; i++) {
                        pirateShip.set(i, pirateShip.get(i) - damage);
                        if (pirateShip.get(i) <= 0){
                            System.out.println("You lost! The pirate ship has sunken.");
                            flag = false;
                            break;
                        }
                    }
                }
            }

            else if (text.equals("Repair")){
                int index = Integer.parseInt(token[1]);
                int health1 = Integer.parseInt(token[2]);
                if (index >= 0 && index < pirateShip.size()){
                    int newHealth = pirateShip.get(index) + health1;
                    if (newHealth > health){
                        newHealth = health;
                    }
                    pirateShip.set(index, newHealth);
                }
            }

            else if (text.equals("Status")){
                int count = 0;
                double minHealth = 0.2 * health;
                for (int i = 0; i < pirateShip.size(); i++) {
                    if (pirateShip.get(i) < minHealth){
                        count++;
                    }
                }
                System.out.printf("%d sections need repair.%n", count);

            }

            command = scanner.nextLine();
        }

        if (flag){
            int pirateSum = 0;
            int warSum = 0;
            for (int i = 0; i < pirateShip.size(); i++) {
                pirateSum = pirateSum + pirateShip.get(i);
            }
            for (int i = 0; i < warShip.size(); i++) {
                warSum = warSum + warShip.get(i);
            }

            System.out.printf("Pirate ship status: %d%n", pirateSum);
            System.out.printf("Warship status: %d", warSum);
        }
    }
}
