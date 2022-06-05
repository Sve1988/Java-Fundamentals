package FinalTest.demo;

import java.util.Scanner;

public class demo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Decode")){
            String[] token = command.split("\\|");
            if (token[0].equals("Move")){
                int move = Integer.parseInt(token[1]);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < move; i++) {
                    sb.append(text.charAt(i));
                }
                String temp = sb.toString();
                StringBuilder sb1 = new StringBuilder(text);
                sb1.replace(0,move,"");
                sb1.append(temp);
                text = sb1.toString();
            }

            else if (token[0].equals("Insert")){
                int index = Integer.parseInt(token[1]);
                String temp = token[2];
                StringBuilder sb = new StringBuilder(text);
                sb.insert(index, temp);
                text = sb.toString();
            }

            else if (token[0].equals("ChangeAll")){
                String subs = token[1];
                String rep = token[2];
                text = text.replace(subs, rep);
            }

            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + text);
    }
}
