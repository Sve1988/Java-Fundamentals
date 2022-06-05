package Week9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "%([A-Z][a-z]+)%<([A-Z][a-z]+)>[a-z]*\\|([0-9]+)\\|[a-z]*([0-9]+.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);
        String text = scanner.nextLine();
        double sum = 0;
        while(!text.equals("end of shift")){

            Matcher matcher = pattern.matcher(text);
            if (matcher.find()){
                String name = matcher.group(1);
                String product = matcher.group(2);
                int quantity = Integer.parseInt(matcher.group(3));
                double price = Double.parseDouble(matcher.group(4));
                double totalPrice = price * quantity;
                System.out.printf("%s: %s - %.2f%n", name, product, totalPrice);
                sum = sum + totalPrice;
            }
            text = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", sum);
    }
}
