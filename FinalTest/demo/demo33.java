package FinalTest.demo;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class demo33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> distance = new TreeMap<>();
        Map<String, Integer> gas = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            String[] token = text.split("\\|");
            String car = token[0];
            int mileage = Integer.parseInt(token[1]);
            int fuel = Integer.parseInt(token[2]);
            distance.put(car, mileage);
            gas.put(car, fuel);
        }
        String text = scanner.nextLine();
        while(!text.equals("Stop")){
            String[] token = text.split(" : ");
            if (token[0].equals("Drive")){
                String car = token[1];
                int mileage = Integer.parseInt(token[2]);
                int fuel = Integer.parseInt(token[3]);
                if (fuel > gas.get(car)){
                    System.out.println("Not enough fuel to make that ride");
                }
                else {
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, mileage, fuel);
                    distance.put(car, distance.get(car) + mileage);
                    gas.put(car, gas.get(car) - fuel);
                    if (distance.get(car) >= 100000){
                        System.out.printf("Time to sell the %s!%n", car);
                        distance.remove(car);
                        gas.remove(car);
                    }
                }
            }

            else if (token[0].equals("Refuel")){
                String car = token[1];
                int fuel = Integer.parseInt(token[2]);
                if (fuel + gas.get(car) <= 75){
                    gas.put(car, gas.get(car) + fuel);
                    System.out.printf("%s refueled with %d liters%n", car, fuel);
                }
                else {
                    int temp = 75 - gas.get(car);
                    gas.put(car, 75);
                    System.out.printf("%s refueled with %d liters%n", car, temp);
                }
            }

            else if (token[0].equals("Revert")){
                String car = token[1];
                int mileage = Integer.parseInt(token[2]);
                if (distance.get(car) - mileage >= 10000){
                    System.out.printf("%s mileage decreased by %d kilometers%n", car, mileage);
                    distance.put(car, distance.get(car) - mileage);
                }
                else {
                    distance.put(car, 10000);
                }
            }

            text = scanner.nextLine();
        }
        distance.entrySet().stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> {
                    System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",e.getKey(), e.getValue(), gas.get(e.getKey()));
                });
    }
}
