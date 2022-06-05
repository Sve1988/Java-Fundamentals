package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        while(!text.equals("end")){
            String[] word = text.split("");
            StringBuilder sb = new StringBuilder();
            for (int i = word.length-1; i >= 0; i--) {
                sb.append(word[i]);
            }
            System.out.println(text + " = " + sb.toString());
            text = scanner.nextLine();
        }
    }
}
