package Week8;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while(!text.equals("end")){
            String[] tokens = text.split("");
            StringBuilder sb = new StringBuilder();
            for (int i = tokens.length - 1; i >= 0; i--) {
                sb.append(tokens[i]);
            }
            System.out.println(text + " = " + sb.toString());

            text = scanner.nextLine();
        }
    }
}
