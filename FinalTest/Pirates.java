package FinalTest;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, Integer> population = new TreeMap<>();
        Map<String, Integer> gold = new TreeMap<>();
        while(!command.equals("Sail")){
            String[] token = command.split("\\|\\|");
            String town = token[0];
            int people = Integer.parseInt(token[1]);
            int golden = Integer.parseInt(token[2]);
            if (!population.containsKey(town)){
                population.put(town, people);
                gold.put(town, golden);
            }
            else {
                population.put(town, population.get(town) + people);
                gold.put(town, gold.get(town) + golden);
            }

            command = scanner.nextLine();
        }

        String text = scanner.nextLine();
        while(!text.equals("End")){
            String[] token = text.split("=>");
            if (token[0].equals("Plunder")){
                String town = token[1];
                int people = Integer.parseInt(token[2]);
                int golden = Integer.parseInt(token[3]);
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, golden, people);
                if ((people == population.get(town)) || (golden == gold.get(town))){
                    System.out.printf("%s has been wiped off the map!%n", town);
                    population.remove(town);
                    gold.remove(town);
                }
                else {
                    population.put(town, population.get(town) - people);
                    gold.put(town, gold.get(town) - golden);
                }
            }

            else if (token[0].equals("Prosper")) {
                String town = token[1];
                int golden = Integer.parseInt(token[2]);
                if ( golden > 0){
                    gold.put(town, gold.get(town) + golden);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", golden, town, gold.get(town));
                }
                else {
                    System.out.println("Gold added cannot be a negative number!");
                }
            }

            text = scanner.nextLine();
        }

        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", population.size());

        gold.entrySet().stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> {
                    System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", e.getKey(), population.get(e.getKey()), e.getValue());
                });
    }
}
