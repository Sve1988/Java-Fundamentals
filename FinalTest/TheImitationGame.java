package FinalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text);
        String command = scanner.nextLine();
        while(!command.equals("Decode")){
            String[] action = command.split("\\|");
            if (action[0].equals("Move")){
                int number = Integer.parseInt(action[1]);
                for (int i = 0; i < number; i++) {
                    sb.append(sb.charAt(0));
                    sb.deleteCharAt(0);
                }
            }
            else if (action[0].equals("Insert")){
                int index = Integer.parseInt(action[1]);
                String value = action[2];
                sb.insert(index, value);
            }

            else if (action[0].equals("ChangeAll")){
                String subs = action[1];
                String replacement = action[2];
                String text1 = sb.toString();
                if (text1.contains(subs)){
                    text1 = text1.replace(subs, replacement);
                }
                sb = new StringBuilder(text1);
            }

            command = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + sb);
    }
}
