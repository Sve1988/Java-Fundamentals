package FinalTest.demo;

import java.util.Scanner;

public class demo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String command = scanner.nextLine();

        while(!command.equals("Reveal")){
            String[] tokens = command.split(":\\|:");
            if (tokens[0].equals("InsertSpace")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < text.length()) {
                    String str = " ";
                    StringBuilder sb = new StringBuilder(text);
                    sb.insert(index, str);
                    text = sb.toString();
                }
                System.out.println(text);
            }
            else if (tokens[0].equals("Reverse")){
                String word = tokens[1];
                StringBuilder sb = new StringBuilder(word);
                sb.reverse();
                String newWord = sb.toString();
                if (text.contains(word)){
                    String replacement = "";
                    text = text.replace(word, replacement);
                    StringBuilder sb1 = new StringBuilder(text);
                    sb1.append(newWord);
                    text = sb1.toString();
                    System.out.println(text);
                }
                else {
                    System.out.println("error");
                }

            }

            else if (tokens[0].equals("ChangeAll")){
                String subs = tokens[1];
                String rep = tokens[2];
                text = text.replace(subs, rep);
                System.out.println(text);
            }

            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + text);
    }
}
