package Week4.Friday;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean flag = true;
        int digits = 0;
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            flag = false;
        }
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if ((symbol < 48 || symbol > 57) && (symbol < 65 || symbol > 90) && (symbol < 97 || symbol > 122)) {
                System.out.println("Password must consist only of letters and digits");
                flag = false;
                break;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (symbol >= 48 && symbol <= 57){
                digits++;
            }
        }

        if (digits < 2){
            System.out.println("Password must have at least 2 digits");
            flag = false;
        }

        if (flag) {
            System.out.println("Password is valid");
        }

    }
}
