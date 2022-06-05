package Week3.Friday;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        String[] line1 = new String[number];
        String[] line2 = new String[number];

        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split(" ");

            String element1 = input[0];
            String element2 = input[1];

            if ((i + 1) % 2 == 1){
                line1[i] = element1;
                line2[i] = element2;
            }
            else {
                line1[i] = element2;
                line2[i] = element1;
            }

        }

        System.out.println(String.join(" ", line1));
        System.out.println(String.join(" ", line2));
    }
}
