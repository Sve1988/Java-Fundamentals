package Demo;

import java.util.*;

public class demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> rarity = new TreeMap<>();
        Map<String, List<Double>> rating = new TreeMap<>();

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
                double ratings = Double.parseDouble(elements[1]);
                if (!rating.containsKey(plant)){
                    rating.put(plant, new ArrayList<>());
                }
                rating.get(plant).add(ratings);
            }

            else if (command.equals("Update")){
                String text1 = token[1];
                String[] elements = text1.split(" - ");
                String plant = elements[0];
                int rar = Integer.parseInt(elements[1]);
                rarity.put(plant, rar);
            }

            else if (command.equals("Reset")){
                String plant = token[1];
                rating.put(plant, new ArrayList<>());
            }

            else {
                System.out.println("error");
            }

            text = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        rarity.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .thenComparingDouble(x -> rating.get(x.getKey()).stream()
                                .mapToDouble(Double::doubleValue)
                                .average().orElse(0.0))
                        .reversed())
                .forEach(e -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", e.getKey(), e.getValue(),
                        rating.get(e.getKey()).stream().mapToDouble(Double::doubleValue).average().orElse(0.0)));
    }
}
