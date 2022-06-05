package FinalTest;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while(!command.equals("Done")){
            String[] token = command.split("\\s+");
            if (token[0].equals("TakeOdd")){
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < password.length(); i++) {
                    char symbol = password.charAt(i);
                    if (i % 2 == 1){
                        sb.append(symbol);
                    }
                }
                password = sb.toString();
                System.out.println(password);
            }

            else if (token[0].equals("Cut")){
                int index = Integer.parseInt(token[1]);
                int length = Integer.parseInt(token[2]);
                if ((index >= 0 && index < password.length()) && index + length < password.length()){
                    StringBuilder sb = new StringBuilder(password);
                    sb.replace(index, index+length, "");
                    password = sb.toString();
                }
                System.out.println(password);
            }

            else if (token[0].equals("Substitute")){
                String substring = token[1];
                String substitute = token[2];
                if (password.contains(substring)){
                    password = password.replace(substring, substitute);
                    System.out.println(password);
                }
                else {
                    System.out.println("Nothing to replace!");
                }
            }

            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }
}
