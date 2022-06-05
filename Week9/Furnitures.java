package Week9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furnitures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>([A-Za-z]+)<<([0-9]+.?[0-9]*)!([0-9]+)";
        List<String> list = new ArrayList<>();
        double total = 0;

        String text = scanner.nextLine();

        while (!text.equals("Purchase")){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                String furniture = matcher.group(1);
                double price = Double.parseDouble(matcher.group(2));
                int quantity = Integer.parseInt(matcher.group(3));
                double totalPrice = price * quantity;
                list.add(furniture);
                total = total + totalPrice;
            }

            text = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.printf("Total money spend: %.2f", total);
    }
}
