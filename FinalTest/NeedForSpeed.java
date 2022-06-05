package FinalTest;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> km = new TreeMap<>();
        Map<String, Integer> tank = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            String[] token = text.split("\\|");
            String car = token[0];
            int mileage = Integer.parseInt(token[1]);
            int fuel = Integer.parseInt(token[2]);
            km.put(car, mileage);
            tank.put(car, fuel);
        }

        String command = scanner.nextLine();

        while(!command.equals("Stop")){
            String[] token = command.split(" : ");
            if (token[0].equals("Drive")){
                String car = token[1];
                int distance = Integer.parseInt(token[2]);
                int fuel = Integer.parseInt(token[3]);
                if (fuel > tank.get(car)){
                    System.out.println("Not enough fuel to make that ride");
                }
                else {
                    km.put(car, km.get(car) + distance);
                    tank.put(car, tank.get(car) - fuel);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                }
                if (km.get(car) >= 100000){
                    System.out.printf("Time to sell the %s!%n", car);
                    km.remove(car);
                    tank.remove(car);
                }
            }

            else if (token[0].equals("Refuel")){
                String car = token[1];
                int fuel = Integer.parseInt(token[2]);
                if ((tank.get(car) + fuel) > 75){
                    int temp = 75 - tank.get(car);
                    System.out.printf("%s refueled with %d liters%n", car, temp);
                    tank.put(car, 75);
                }
                else {
                    tank.put(car, tank.get(car) + fuel);
                    System.out.printf("%s refueled with %d liters%n", car, fuel);
                }
            }

            else if (token[0].equals("Revert")){
                String car = token[1];
                int distance = Integer.parseInt(token[2]);
                if ((km.get(car) - distance) < 10000){
                    km.put(car, 10000);
                }
                else {
                    System.out.printf("%s mileage decreased by %d kilometers%n", car, distance);
                    km.put(car, km.get(car) - distance);
                }
            }

            command = scanner.nextLine();
        }

        km.entrySet().stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
            .forEach(e -> {
                System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", e.getKey(),e.getValue(), tank.get(e.getKey()));
                });
    }
}
