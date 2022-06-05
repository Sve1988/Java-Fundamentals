package FinalTest.demo;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class demo34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> hpPoint = new TreeMap<>();
        Map<String, Integer> mpPoint = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            String[] token = text.split("\\s+");
            String name = token[0];
            int hpPoints = Integer.parseInt(token[1]);
            int mpPoints = Integer.parseInt(token[2]);
            if (!hpPoint.containsKey(name) && (!mpPoint.containsKey(name))) {
                hpPoint.put(name, hpPoints);
                mpPoint.put(name, mpPoints);
            }
        }

        String command = scanner.nextLine();

        while(!command.equals("End")){
            String[] token = command.split(" - ");

            if (token[0].equals("CastSpell")){
                String name = token[1];
                int mp = Integer.parseInt(token[2]);
                String spell = token[3];
                if (mpPoint.get(name) >= mp){
                    mpPoint.put(name, mpPoint.get(name) - mp);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", name, spell, mpPoint.get(name));
                }
                else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", name, spell);
                }
            }

            else if (token[0].equals("TakeDamage")){
                String name = token[1];
                int damage = Integer.parseInt(token[2]);
                String attacker = token[3];
                if (hpPoint.get(name) > damage){
                    hpPoint.put(name, hpPoint.get(name) - damage);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, hpPoint.get(name));
                }
                else {
                    System.out.printf("%s has been killed by %s!%n", name, attacker);
                    mpPoint.remove(name);
                    hpPoint.remove(name);
                }
            }

            else if (token[0].equals("Recharge")){
                String name = token[1];
                int amount = Integer.parseInt(token[2]);
                if ((mpPoint.get(name) + amount) <= 200) {
                    mpPoint.put(name, mpPoint.get(name) + amount);
                    System.out.printf("%s recharged for %d MP!%n", name, amount);
                }
                else {
                    int temp = 200 - mpPoint.get(name);
                    mpPoint.put(name, 200);
                    System.out.printf("%s recharged for %d MP!%n", name, temp);
                }
            }

            else if (token[0].equals("Heal")){
                String name = token[1];
                int amount = Integer.parseInt(token[2]);
                if ((hpPoint.get(name) + amount) <=100) {
                    hpPoint.put(name, hpPoint.get(name) + amount);
                    System.out.printf("%s healed for %d HP!%n", name, amount);
                }
                else {
                    int temp = 100 - hpPoint.get(name);
                    hpPoint.put(name, 100);
                    System.out.printf("%s healed for %d HP!%n", name, temp);
                }
            }

            command = scanner.nextLine();
        }

        hpPoint.entrySet().stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> {
                    System.out.println(e.getKey());
                    System.out.printf("  HP: %d%n", e.getValue());
                    System.out.printf("  MP: %d%n", mpPoint.get(e.getKey()));
                });

    }
}
