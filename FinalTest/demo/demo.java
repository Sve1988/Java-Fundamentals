package FinalTest.demo;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String command = scanner.nextLine();
        while(!command.equals("Done")){
            String [] token = command.split("\\s+");
            if (token[0].equals("TakeOdd")){
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < text.length(); i++) {
                    char symbol = text.charAt(i);
                    if (i % 2 == 1){
                        sb.append(symbol);
                    }
                }
                text = sb.toString();
                System.out.println(text);
            }

            else if (token[0].equals("Cut")){
                int startIndex = Integer.parseInt(token[1]);
                int length = Integer.parseInt(token[2]);
                if ((startIndex >= 0 && startIndex < text.length()) && (startIndex + length >= 0 && startIndex + length < text.length())){
                    String sub = text.substring(startIndex, startIndex + length);
                    int firstIndex = text.indexOf(sub);
                    StringBuilder sb = new StringBuilder(text);
                    sb.replace(firstIndex, firstIndex + length, "");
                    text = sb.toString();
                    System.out.println(text);
                }
            }

            else if (token[0].equals("Substitute")){
                String sub = token[1];
                String newSub = token[2];
                if (text.contains(sub)){
                    text = text.replace(sub, newSub);
                    System.out.println(text);
                }
                else {
                    System.out.println("Nothing to replace!");
                }
            }

            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + text);
    }
}
