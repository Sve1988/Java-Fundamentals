package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            list.add(i, elements[i]);
        }
        int counter = 0;
        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] token = command.split(" ");
            int index1 = Integer.parseInt(token[0]);
            int index2 = Integer.parseInt(token[1]);
            if ((index1 < 0 || index1 > list.size()-1) || (index2 < 0) || (index2 > list.size() -1)){
                System.out.println("Invalid input! Adding additional elements to the board");
                int addCounter = counter + 1;
                String addText = "-" + addCounter + "a";
                list.add(list.size() / 2, addText);
                list.add(list.size() / 2, addText);
            }
            else {
                String sign1 = list.get(index1);
                String sign2 = list.get(index2);
                if (sign1.equals(sign2)) {
                    String match = sign1;
                    list.remove(sign1);
                    list.remove(sign2);
                    counter++;
                    System.out.printf("Congrats! You have found matching elements - %s!", match);
                    System.out.println();
                }
                else {
                    System.out.println("Try again!");
                }
            }

            if (list.isEmpty()){
                System.out.printf("You have won in %d turns!", counter);
                break;
            }
            command = scanner.nextLine();
        }

        if (!list.isEmpty()){
            System.out.println("Sorry you lose :(");
            for (String s : list) {
                System.out.print(s + " ");
            }
        }
    }
}
