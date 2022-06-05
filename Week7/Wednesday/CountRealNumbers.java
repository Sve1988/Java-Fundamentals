package Week7.Wednesday;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Double> nums = Arrays.stream(input.split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());
        Map<Double, Integer> counts = new TreeMap<>();
        for (Double num : nums) {
            if (!counts.containsKey(num)){
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num)+1);
        }
        for (Map.Entry<Double,Integer> entry: counts.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
