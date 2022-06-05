package Demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String regexText = "(@#+)([A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)";

        Pattern pattern = Pattern.compile(regexText);

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regexDigit = "[0-9]";
                String word = matcher.group(2);
                Pattern pattern1 = Pattern.compile(regexDigit);
                Matcher matcher1 = pattern1.matcher(word);
                StringBuilder sb = new StringBuilder();
                while (matcher1.find()) {
                    sb.append(matcher1.group());
                }
                String code = sb.toString();
                if (code.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + code);
                }
            }
            else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
