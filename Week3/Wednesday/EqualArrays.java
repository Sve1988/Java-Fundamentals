package Week3.Wednesday;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean flag = true;
        String input1 = scanner.nextLine();
        String [] elements1 = input1.split(" ");
        int [] array1 = new int[elements1.length];
        for (int i = 0; i < array1.length; i++) {
            array1 [i] = Integer.parseInt(elements1 [i]);
        }

        String input2 = scanner.nextLine();
        String [] elements2 = input2.split(" ");
        int [] array2 = new int[elements2.length];
        for (int i = 0; i < array2.length; i++) {
            array2 [i] = Integer.parseInt(elements2 [i]);
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1 [i] == array2 [i]){
                sum = sum + array1 [i];
            }
            else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
