package Demo;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String command = scanner.nextLine();

        while(!command.equals("Reveal")){
            String[] token = command.split(":\\|:");
            if (token[0].equals("InsertSpace")){
                int index = Integer.parseInt(token[1]);
                String add = " ";
                if (index >= 0 && index < text.length()){
                    StringBuilder sb = new StringBuilder(text);
                    sb.insert(index, add);
                    text = sb.toString();
                    System.out.println(text);
                }
            }

            else if (token[0].equals("Reverse")){
                String sub = token[1];
                if (text.contains(sub)){
                    int index = text.indexOf(sub);
                    StringBuilder sb = new StringBuilder(text);
                    sb.replace(index, index+sub.length(),"");
                    StringBuilder sb1 = new StringBuilder(sub);
                    sb1.reverse();
                    sb.append(sb1);
                    text = sb.toString();
                    System.out.println(text);
                }
                else {
                    System.out.println("error");
                }
            }

            else if (token[0].equals("ChangeAll")){
                String sub = token[1];
                String rep = token[2];
                text = text.replace(sub, rep);
                System.out.println(text);
            }

            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + text);
    }
}
