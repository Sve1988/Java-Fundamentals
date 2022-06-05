package FinalExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String command = scanner.nextLine();

        while(!command.equals("Done")){
            String[] token = command.split(" ");
            if (token[0].equals("Change")){
                char symbol = token[1].charAt(0);
                String replacement = token[2];
                String s = Character.toString(symbol);
                text = text.replace(s, replacement);
                System.out.println(text);
            }
            else if (token[0].equals("Includes")){
                String add = token[1];
                if (text.contains(add)){
                    System.out.println("True");
                }
                else {
                    System.out.println("False");
                }
            }
            else if (token[0].equals("End")){
                String word = token[1];
                int index = word.length();
                String newWord = text.substring(text.length() - index, text.length());
                if (word.equals(newWord)){
                    System.out.println("True");
                }
                else {
                    System.out.println("False");
                }
            }
            else if (token[0].equals("Uppercase")){
                text = text.toUpperCase();
                System.out.println(text);
            }
            else if (token[0].equals("FindIndex")){
                char symbol = token[1].charAt(0);
                String s = Character.toString(symbol);
                System.out.println(text.indexOf(s));
            }
            else if (token[0].equals("Cut")){
                int startIndex = Integer.parseInt(token[1]);
                int length = Integer.parseInt(token[2]);
                String sub = text.substring(startIndex, startIndex + length);
                text = sub;
                System.out.println(text);
            }

            command = scanner.nextLine();
        }
    }
}
