package FinalTest;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String[] token = command.split(":");
            if (token[0].equals("Add Stop")){
                int index = Integer.parseInt(token[1]);
                String addText = token[2];
                if (index >= 0 && index < text.length()){
                    StringBuilder sb = new StringBuilder(text);
                    sb.insert(index, addText);
                    text = sb.toString();
                }
                System.out.println(text);
            }

            else if (token[0].equals("Remove Stop")){
                int startIndex = Integer.parseInt(token[1]);
                int endIndex = Integer.parseInt(token[2]);
                if ((startIndex >= 0 && startIndex < text.length()) && (endIndex >= 0 && endIndex < text.length())){
                    StringBuilder sb = new StringBuilder(text);
                    sb = sb.replace(startIndex, endIndex + 1, "");
                    text = sb.toString();
                }
                System.out.println(text);
            }

            else if (token[0].equals("Switch")){
                String oldString = token[1];
                String newString = token[2];
                if (text.contains(oldString)) {
                    text = text.replace(oldString, newString);
                }
                System.out.println(text);
            }

                command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + text);
    }
}
