package FinalTest.demo;

import java.util.Scanner;

public class demo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String command = scanner.nextLine();

        while(!command.equals("Travel")){
            String[] token = command.split("\\:");
            if (token[0].equals("Add Stop")){
                int index = Integer.parseInt(token[1]);
                String word = token[2];

                if (index >= 0 && index < text.length()){
                    StringBuilder sb = new StringBuilder(text);
                    sb.insert(index, word);
                    text = sb.toString();
                }
                System.out.println(text);
            }

            else if (token[0].equals("Remove Stop")){
                int startIndex = Integer.parseInt(token[1]);
                int endIndex = Integer.parseInt(token[2]);
                if ((startIndex >= 0 && startIndex < text.length())&& (endIndex >= 0 && endIndex < text.length())){
                    String sub = "";
                    StringBuilder sb = new StringBuilder(text);
                    sb.replace(startIndex, endIndex+1, sub);
                    text = sb.toString();
                }
                System.out.println(text);
            }

            else if (token[0].equals("Switch")){
                String oldWord = token[1];
                String newWord = token[2];
                if (text.contains(oldWord)){
                    text = text.replace(oldWord, newWord);
                }
                System.out.println(text);
            }

            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + text);
    }
}
