package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text);
        String subs = scanner.nextLine();
        String replacement = scanner.nextLine();

        if (text.contains(subs)){
            text = text.replace(subs, replacement);
        }
        sb = new StringBuilder(text);
        System.out.println(sb);
    }
}
