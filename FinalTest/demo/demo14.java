package FinalTest.demo;

import java.util.Scanner;

public class demo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        String command = scanner.nextLine();

        while(!command.equals("Done")){
            String[] tokens = command.split("\\s+");
            if (tokens[0].equals("TakeOdd")){
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < pass.length(); i++) {
                    char symbol = pass.charAt(i);
                    if (i % 2 == 1){
                        sb.append(symbol);
                    }
                }
                pass = sb.toString();
                System.out.println(pass);
            }

            else if (tokens[0].equals("Cut")){
                int index = Integer.parseInt(tokens[1]);
                int length = Integer.parseInt(tokens[2]);
                if ((index >= 0 && index < pass.length()) && (index + length < pass.length())){
                    String sub = pass.substring(index, index + length);
                    StringBuilder sb = new StringBuilder(pass);
                    sb.replace(index, index + length, "");
                    pass = sb.toString();
                }
                System.out.println(pass);
            }

            else if (tokens[0].equals("Substitute")){
                String subs = tokens[1];
                String newSubs = tokens[2];
                if (pass.contains(subs)){
                    pass = pass.replace(subs, newSubs);
                    System.out.println(pass);
                }
                else {
                    System.out.println("Nothing to replace!");
                }
            }

            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + pass);
    }
}
