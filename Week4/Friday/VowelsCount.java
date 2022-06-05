package Week4.Friday;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        int numbers = text.length();
        int counter = 0;
        for (int i = 0; i < numbers; i++) {
            char symbol = text.charAt(i);
            if (symbol == 'a' || symbol =='e' || symbol =='i' || symbol == 'o' || symbol == 'u'){
                counter++;
            }
        }
        System.out.println(counter);
    }


}
