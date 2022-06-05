package Test;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int win = 0;
        boolean flag = true;

        while (!input.equals("End of battle")){
            int distance = Integer.parseInt(input);
            if (energy >= distance){
                energy = energy - distance;
                win++;
                if (win % 3 == 0){
                    energy = energy + win;
                }
            }
            else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", win, energy);
                flag = false;
                break;
            }
            input = scanner.nextLine();
        }
        if (flag){
            System.out.printf("Won battles: %d. Energy left: %d", win, energy);
        }
    }
}
