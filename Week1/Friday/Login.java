package Week1.Friday;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        StringBuilder newPass = new StringBuilder();

        for (int i = username.length() - 1; i >= 0; i--) {
            char symbol = username.charAt(i);
            newPass.append(symbol);
        }

        password = newPass.toString();

        String input = scanner.nextLine();
        int count = 0;

        while (!input.equals(password)){
            count++;
            if (count == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }

        if (input.equals(password)){
            System.out.printf("User %s logged in.", username);
        }
    }
}
