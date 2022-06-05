package FinalExam;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> health = new TreeMap<>();
        Map<String, Integer> energy = new TreeMap<>();

        String text = scanner.nextLine();

        while (!text.equals("Results")){
            String[] token = text.split(":");
            if (token[0].equals("Add")){
                String name = token[1];
                int healthy = Integer.parseInt(token[2]);
                int energies = Integer.parseInt(token[3]);
                if (!health.containsKey(name)){
                    health.put(name, healthy);
                    energy.put(name, energies);
                }
                else {
                    health.put(name, health.get(name) + healthy);
                }
            }
            else if (token[0].equals("Attack")){
                String attacker = token[1];
                String defender = token[2];
                int damage = Integer.parseInt(token[3]);
                if (health.containsKey(attacker) && (health.containsKey(defender))){
                    health.put(defender, health.get(defender) - damage);
                    if (health.get(defender) <= 0){
                        System.out.printf("%s was disqualified!%n", defender);
                        health.remove(defender);
                        energy.remove(defender);
                    }
                    energy.put(attacker, energy.get(attacker) - 1);
                    if (energy.get(attacker) == 0){
                        System.out.printf("%s was disqualified!%n", attacker);
                        health.remove(attacker);
                        energy.remove(attacker);
                    }
                }
            }
            else if (token[0].equals("Delete")){
                String username = token[1];
                if (username.equals("All")){
                    health.clear();
                    energy.clear();
                }
                else {
                    if (health.containsKey(username)){
                        health.remove(username);
                        energy.remove(username);
                    }
                }
            }
            text = scanner.nextLine();
        }
        System.out.printf("People count: %d%n", health.size());
        health.entrySet().stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e-> {
                    System.out.printf("%s - %d - %d%n", e.getKey(), e.getValue(), energy.get(e.getKey()));
                });
    }
}
