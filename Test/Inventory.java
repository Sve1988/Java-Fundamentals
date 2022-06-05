package Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> items = Arrays.stream(input.split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("Craft!")){
            String[] elements = command.split(" ");
            if (elements[0].equals("Collect")){
                String item = elements[2];
                boolean flag = false;
                for (int i = 0; i < items.size(); i++) {
                    if (item.equals(items.get(i))){
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    items.add(item);
                }
            }
            else if (elements[0].equals("Drop")){
                String item = elements[2];
                for (int i = 0; i < items.size(); i++) {
                    if (item.equals(items.get(i))){
                        items.remove(items.get(i));
                        i--;
                    }
                }
            }
            else if (elements[0].equals("Combine")){
                String item = elements[3];
                String[] newItem = item.split(":");
                String wordCheck = newItem[0];
                for (int i = 0; i < items.size(); i++) {
                    if (wordCheck.equals(items.get(i))){
                        items.add(i+1, newItem[1]);
                        break;
                    }
                }
            }
            else if (elements[0].equals("Renew")){
                String item = elements[2];
                for (int i = 0; i < items.size(); i++) {
                    if (item.equals(items.get(i))){
                        items.add(items.size(), item);
                        items.remove(i);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < items.size() - 1; i++) {
            System.out.print(items.get(i) + ", ");
        }
        System.out.println(items.get(items.size()-1));
    }
}
