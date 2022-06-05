package Demo;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> HP = new TreeMap<>();
        Map<String, Integer> MP = new TreeMap<>();

        for (int i = 0; i < n; i++) {
           String text = scanner.nextLine();
           String[] token = text.split("\\s+");
           String name = token[0];
           int hpPoints = Integer.parseInt(token[1]);
           int mpPoints = Integer.parseInt(token[2]);
           if (hpPoints > 100){
               HP.put(name, 100);
           }
           else{
               HP.put(name, hpPoints);
           }
           if (mpPoints > 200){
               MP.put(name, 200);
           }
           else {
               MP.put(name, mpPoints);
           }
        }

        String text = scanner.nextLine();

        while (!text.equals("End")){
            String[] token = text.split(" - ");
            if (token[0].equals("CastSpell")){
                String name = token[1];
                int mpNeeded = Integer.parseInt(token[2]);
                String spell = token[3];
                if (MP.get(name) >= mpNeeded){
                    MP.put(name, MP.get(name) - mpNeeded);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", name, spell, MP.get(name));
                }
                else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", name, spell);
                }
            }
            else if (token[0].equals("TakeDamage")){
                String name = token[1];
                int damage = Integer.parseInt(token[2]);
                String attacker = token[3];
                if (HP.get(name) > damage){
                    HP.put(name, HP.get(name) - damage);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, HP.get(name));
                }
                else {
                    System.out.printf("%s has been killed by %s!%n", name, attacker);
                    HP.remove(name);
                    MP.remove(name);
                }
            }

            else if (token[0].equals("Recharge")){
                String name = token[1];
                int amount = Integer.parseInt(token[2]);
                if (MP.get(name) + amount <= 200){
                    MP.put(name, MP.get(name) + amount);
                    System.out.printf("%s recharged for %d MP!%n", name, amount);
                }
                else {
                    int temp = 200 - MP.get(name);
                    MP.put(name, 200);
                    System.out.printf("%s recharged for %d MP!%n", name, temp);
                }
            }

            else if (token[0].equals("Heal")){
                String name = token[1];
                int amount = Integer.parseInt(token[2]);
                if (HP.get(name) + amount <= 100){
                    HP.put(name, HP.get(name) + amount);
                    System.out.printf("%s healed for %d HP!%n", name, amount);
                }
                else {
                    int temp = 100 - HP.get(name);
                    HP.put(name, 100);
                    System.out.printf("%s healed for %d HP!%n", name, temp);
                }
            }

            text = scanner.nextLine();
        }

        HP.entrySet().stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()) ).forEach(e -> {
            System.out.println(e.getKey());
            System.out.printf("  HP: %d%n", e.getValue());
            System.out.printf("  MP: %d%n", MP.get(e.getKey()));
        });


    }
}
