package Week3.Friday;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();

        String [] elements1 = text1.split(" ");
        String [] elements2 = text2.split(" ");

        for (int i = 0; i < elements2.length; i++) {

            for (int j = 0; j < elements1.length; j++) {
                if ((elements2[i]).equals(elements1[j])) {
                    System.out.print(elements2[i] + " ");
                    break;
                }
            }
        }
    }
}
