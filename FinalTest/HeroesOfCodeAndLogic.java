package FinalTest;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> hp = new TreeMap<>();
        Map<String, Integer> mp = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            String[] token = text.split("\\s+");
            String name = token[0];
            int HP = Integer.parseInt(token[1]);
            int MP = Integer.parseInt(token[2]);
            if (!hp.containsKey(name) && (!mp.containsKey(name))) {
                hp.put(name, HP);
                mp.put(name, MP);
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] token = command.split(" - ");

            if (token[0].equals("CastSpell")){
                String name = token[1];
                int mpPoints = Integer.parseInt(token[2]);
                String spellName = token[3];
                if (mp.get(name) >= mpPoints){
                    mp.put(name, mp.get(name) - mpPoints);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", name, spellName, mp.get(name));
                }
                else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", name, spellName);
                }
            }

            else if (token[0].equals("TakeDamage")){
                String name = token[1];
                int damage = Integer.parseInt(token[2]);
                String attacker = token[3];
                if (hp.get(name) > damage){
                    hp.put(name, hp.get(name) - damage);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, hp.get(name));
                }
                else {
                    System.out.printf("%s has been killed by %s!%n", name, attacker);
                    hp.remove(name);
                    mp.remove(name);
                }
            }

            else if (token[0].equals("Recharge")){
                String name = token[1];
                int amount = Integer.parseInt(token[2]);
                if ((mp.get(name) + amount) <= 200){
                    mp.put(name, mp.get(name) + amount);
                    System.out.printf("%s recharged for %d MP!%n", name, amount);
                }
                else {
                    int temp = 200 - mp.get(name);
                    mp.put(name, 200);
                    System.out.printf("%s recharged for %d MP!%n", name, temp);
                }
            }

            else if (token[0].equals("Heal")){
                String name = token[1];
                int amount = Integer.parseInt(token[2]);
                if ((hp.get(name) + amount) <= 100){
                    hp.put(name, hp.get(name) + amount);
                    System.out.printf("%s healed for %d HP!%n", name, amount);
                }
                else {
                    int temp = 100 - hp.get(name);
                    hp.put(name, 100);
                    System.out.printf("%s healed for %d HP!%n", name, temp);
                }
            }

            command = scanner.nextLine();
        }

        hp.entrySet().stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> {
                    System.out.println(e.getKey());
                    System.out.printf("  HP: %d%n",e.getValue());
                    System.out.printf("  MP: %d%n", mp.get(e.getKey()));
                });
    }
}
