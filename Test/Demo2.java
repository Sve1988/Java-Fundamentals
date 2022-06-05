package Test;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        int won = 0;
        boolean flag = true;

        while (!text.equals("End of battle")) {
            int distance = Integer.parseInt(text);
            if (energy >= distance) {
                energy = energy - distance;
                won++;
                if (won % 3 == 0) {
                    energy = energy + won;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", won, energy);
                flag = false;
                break;
            }

            text = scanner.nextLine();
        }

        if (flag) {
            System.out.printf("Won battles: %d. Energy left: %d", won, energy);
        }
    }
}
