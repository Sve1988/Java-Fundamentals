package Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int bitcoin = 0;
        int count = 1;
        List<String> actions = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        for (int i = 0; i < actions.size(); i++) {
            String[] tokens = actions.get(i).split(" ");
            String command = tokens[0];
            int blood = Integer.parseInt(tokens[1]);
            if (command.equals("potion")){
                if (health + blood > 100){
                    blood = 100 - health;
                    health = 100;
                }
                else {
                    health = health + blood;
                }
                count++;
                System.out.printf("You healed for %d hp.", blood);
                System.out.println();
                System.out.printf("Current health: %d hp.", health);
                System.out.println();
            }
            else if (command.equals("chest")){
                System.out.printf("You found %d bitcoins.", blood);
                System.out.println();
                bitcoin = bitcoin + blood;
                count++;
            }
            else {
                health = health - blood;
                if (health > 0) {
                    System.out.printf("You slayed %s.", command);
                    System.out.println();
                    count++;
                }
                else {
                    System.out.printf("You died! Killed by %s.", command);
                    System.out.println();
                    System.out.printf("Best room: %d", count);
                    break;
                }
            }
        }
        if (health > 0){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d", bitcoin);
            System.out.println();
            System.out.printf("Health: %d", health);
        }
    }
}
