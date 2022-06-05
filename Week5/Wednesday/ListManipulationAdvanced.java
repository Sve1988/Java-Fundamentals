package Week5.Wednesday;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<Integer> items = Arrays.stream(text.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] elements = command.split("\\s+");
            if (elements[0].equals("Contains")){
                int number = Integer.parseInt(elements[1]);
                if (items.contains(number)){
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No such number");
                }
            }
            else if (elements[0].equals("Print") && elements[1].equals("even")){
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i) % 2 == 0){
                        System.out.print(items.get(i) + " ");
                    }
                }
                System.out.println();
            }
            else if (elements[0].equals("Print") && elements[1].equals("odd")){
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i) % 2 == 1){
                        System.out.print(items.get(i) + " ");
                    }
                }
                System.out.println();
            }
            else if (elements[0].equals("Get") && elements[1].equals("sum")){
                int sum = 0;
                for (int i = 0; i < items.size(); i++) {
                    sum = sum + items.get(i);
                }
                System.out.println(sum);
            }
            else if (elements[0].equals("Filter")){
                String condition = elements[1];
                int number = Integer.parseInt(elements[2]);
                if (elements[1].equals("<")){
                    for (int i = 0; i < items.size(); i++) {
                        if(number > items.get(i)){
                            System.out.print(items.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
                else if (elements[1].equals(">")){
                    for (int i = 0; i < items.size(); i++) {
                        if(number < items.get(i)){
                            System.out.print(items.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
                else if (elements[1].equals("<=")){
                    for (int i = 0; i < items.size(); i++) {
                        if(number >= items.get(i)){
                            System.out.print(items.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
                else if (elements[1].equals(">=")){
                    for (int i = 0; i < items.size(); i++) {
                        if(number <= items.get(i)){
                            System.out.print(items.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
            }

            command = scanner.nextLine();
        }
    }
}
