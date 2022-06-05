package FinalTest;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while(!command.equals("Reveal")){
            String[] token = command.split(":\\|:");
            String action = token[0];
            if (action.equals("InsertSpace")){
                int index = Integer.parseInt(token[1]);
                if (index >= 0 && index < message.length()){
                    StringBuilder sb = new StringBuilder(message);
                    sb.insert(index, " ");
                    message = sb.toString();
                }
                System.out.println(message);
            }

            else if (action.equals("Reverse")){
                String subs = token[1];
                if (message.contains(subs)){
                    StringBuilder sb = new StringBuilder(subs);
                    sb.reverse();
                    String text = sb.toString();
                   // message = message.replace(subs,"");
                 //   StringBuilder sb1 = new StringBuilder(message);
                 //   sb1.append(sb);
                 //   message = sb1.toString();
                    int subsLength = subs.length();
                    int index = message.indexOf(subs);
                    StringBuilder sb1 = new StringBuilder(message);
                    sb1.append(text);
                    sb1 = sb1.replace(index, index + subsLength, "");
                    message = sb1.toString();
                    System.out.println(message);
                }
                else {
                    System.out.println("error");
                }

            }

            else if (action.equals("ChangeAll")){
                String subs = token[1];
                String replacement = token[2];
                if (message.contains(subs)){
                   message = message.replace(subs, replacement);
                }
                System.out.println(message);
            }

            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }
}
