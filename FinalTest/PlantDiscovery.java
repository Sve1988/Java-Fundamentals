package FinalTest;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> rarity = new TreeMap<>();
        Map<String, Double> rating = new TreeMap<>();
        Map<String, Integer> count = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            String[] token = text.split("<->");
            String name = token[0];
            int rarit = Integer.parseInt(token[1]);
            rarity.put(name, rarit);
        }

        String text = scanner.nextLine();

        while(!text.equals("Exhibition")){
            String[] token = text.split(": ");
            String command = token[0];

            if (command. equals("Rate")){
                String text1 = token[1];
                String[] elements = text1.split(" - ");
                String plant = elements[0];

                if (!rarity.containsKey(plant)) {
                    System.out.println("error");
                    continue;
                }

                double ratings = Double.parseDouble(elements[1]);
                if (!rating.containsKey(plant)){
                    rating.put(plant, ratings);
                    count.put(plant, 1);
                }
                else {
                    rating.put(plant, ratings + rating.get(plant));
                    count.put(plant, count.get(plant) + 1);
                }

            }

            else if (command.equals("Update")){
                String text1 = token[1];
                String[] elements = text1.split(" - ");
                String plant = elements[0];

                if (!rarity.containsKey(plant)) {
                    System.out.println("error");
                    continue;
                }
                int rar = Integer.parseInt(elements[1]);
                rarity.put(plant, rar);
            }

            else if (command.equals("Reset")){
                    String plant = token[1];

                if (!rarity.containsKey(plant)) {
                    System.out.println("error");
                    continue;
                }
                    rating.put(plant, 0.0);
                    count.put(plant, 0);
                }

            else {
                System.out.println("error");
            }

            text = scanner.nextLine();
        }

        Map<String, Double> avRating = new TreeMap<>();
        for (Map.Entry<String, Double> entry : rating.entrySet()) {
            if (entry.getValue() == 0) {
                avRating.put(entry.getKey(), 0.0);
            }
            else {
                double average = entry.getValue() / count.get(entry.getKey());
                avRating.put(entry.getKey(), average);
            }
        }

        System.out.println("Plants for the exhibition:");
        rarity.entrySet().stream()
                .sorted((e1,e2) -> {
                    int res = e2.getValue().compareTo(e1.getValue());
                    if (res == 0)
                        res = avRating.get(e2.getKey()).compareTo(avRating.get(e1.getKey()));
                        return res; })
                .forEach(e -> {
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", e.getKey(), e.getValue(), avRating.get(e.getKey()));
                });

    }
}
