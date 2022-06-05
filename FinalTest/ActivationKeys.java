package FinalTest;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        String command = scanner.nextLine();
        while(!command.equals("Generate")){
            String[] token = command.split(">>>");
            if (token[0].equals("Contains")){
                String substring = token[1];
                if (pass.contains(substring)){
                    System.out.printf("%s contains %s%n", pass, substring);
                }
                else {
                    System.out.println("Substring not found!");
                }
            }

            else if (token[0].equals("Flip")) {
                String action = token[1];
                int startIndex = Integer.parseInt(token[2]);
                int endIndex = Integer.parseInt(token[3]);
                if ((startIndex >= 0 && startIndex < pass.length()) && (endIndex >= 0 && endIndex < pass.length())) {
                    if (action.equals("Upper")) {
                        String subs = pass.substring(startIndex, endIndex);
                        String newSubs = subs;
                        subs = subs.toUpperCase();
                        pass = pass.replace(newSubs, subs);
                        System.out.println(pass);
                    }

                    else if (action.equals("Lower")){
                        String subs = pass.substring(startIndex, endIndex);
                        String newSubs = subs;
                        subs = subs.toLowerCase();
                        pass = pass.replace(newSubs, subs);
                        System.out.println(pass);
                    }
                }
            }

            else if (token[0].equals("Slice")){
                int startIndex = Integer.parseInt(token[1]);
                int endIndex = Integer.parseInt(token[2]);
                if ((startIndex >= 0 && startIndex < pass.length()) && (endIndex >= 0 && endIndex < pass.length())){
                    String replacement = "";
                    String match = pass.substring(startIndex, endIndex);
                    pass = pass.replace(match, replacement);
                    System.out.println(pass);
                }
            }
            command = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + pass);
    }
}
