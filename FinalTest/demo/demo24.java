package FinalTest.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(@#+)([A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)";
        Pattern pattern = Pattern.compile(regex);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()){
                String regex1 = "[0-9]";
                String word = matcher.group(2);
                Pattern pattern1 = Pattern.compile(regex1);
                Matcher matcher1 = pattern1.matcher(word);
                StringBuilder sb = new StringBuilder();
                while(matcher1.find()){
                    sb.append(matcher1.group());
                }
                String code = sb.toString();

                if (code.length() == 0){
                    System.out.println("Product group: 00");
                }
                else {
                    System.out.printf("Product group: %s%n",code);
                }
            }
            else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
