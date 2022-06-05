package FinalTest.demo;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class demo31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> composers = new TreeMap<>();
        Map<String, String> keys = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            String[] token = text.split("\\|");
            String piece = token[0];
            String composer = token[1];
            String key = token[2];
            composers.put(piece, composer);
            keys.put(piece, key);
        }

        String text = scanner.nextLine();

        while (!text.equals("Stop")){
            String[] token = text.split("\\|");
            String command = token[0];
            if (command.equals("Add")){
                String piece = token[1];
                String composer = token[2];
                String key = token[3];
                if(keys.containsKey(piece)){
                    System.out.printf("%s is already in the collection!%n", piece);
                }
                else {
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    composers.put(piece, composer);
                    keys.put(piece, key);
                }
            }

            else if (command.equals("Remove")){
                String piece = token[1];
                if (composers.containsKey(piece)){
                    composers.remove(piece);
                    keys.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                }
                else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }

            else if (command.equals("ChangeKey")){
                String piece = token[1];
                String key = token[2];
                if (keys.containsKey(piece)){
                    keys.put(piece, key);
                    System.out.printf("Changed the key of %s to %s!%n", piece, key);
                }
                else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }

            text = scanner.nextLine();
        }
        composers.entrySet().stream()
                .forEach(e -> {
                    System.out.printf("%s -> Composer: %s, Key: %s%n",e.getKey(),e.getValue(), keys.get(e.getKey()));
                });

    }
}
