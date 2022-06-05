package FinalTest.demo;

import java.util.Scanner;

public class demo15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String action = scanner.nextLine();

        while (!action.equals("Generate")) {
            String[] commands = action.split(">>>");
            if (commands[0].equals("Contains")) {
                String substring = commands[1];
                if (text.contains(substring)) {
                    System.out.printf("%s contains %s%n", text, substring);
                } else {
                    System.out.printf("Substring not found!%n");
                }
            } else if (commands[0].equals("Flip")) {
                String change = commands[1];
                int startIndex = Integer.parseInt(commands[2]);
                int endIndex = Integer.parseInt(commands[3]);
                if (((startIndex >= 0) && startIndex < text.length()) && ((endIndex >= 0) && (endIndex < text.length()))) {
                    if (change.equals("Upper")) {
                        String sub = text.substring(startIndex, endIndex);
                        sub = sub.toUpperCase();
                        StringBuilder sb = new StringBuilder(text);
                        sb.replace(startIndex, endIndex, sub);
                        text = sb.toString();
                    }
                    else if (change.equals("Lower")){
                        String sub = text.substring(startIndex, endIndex);
                        sub = sub.toLowerCase();
                        StringBuilder sb = new StringBuilder(text);
                        sb.replace(startIndex, endIndex, sub);
                        text = sb.toString();
                    }
                    System.out.println(text);
                }
            }

            else if (commands[0].equals("Slice")){
                int startIndex = Integer.parseInt(commands[1]);
                int endIndex = Integer.parseInt(commands[2]);
                if (((startIndex >= 0) && startIndex < text.length()) && ((endIndex >= 0) && (endIndex < text.length()))){
                    String change = "";
                    StringBuilder sb = new StringBuilder(text);
                    sb.replace(startIndex, endIndex, change);
                    text = sb.toString();
                    System.out.println(text);
                }
            }

            action = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + text);
    }
}
