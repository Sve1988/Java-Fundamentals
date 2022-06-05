package Week3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int numbers = Integer.parseInt(scanner.nextLine());
       int[] array = new int[numbers];
       String text = scanner.nextLine();
       String[] elements = text.split(" ");
        for (int i = 0; i < elements.length; i++) {
            int num = Integer.parseInt(elements[i]);
            for (int j = 0; j < array.length; j++) {
                if (j == num){
                    array[j] = 1;
                    break;
                }
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String [] elementsCommand = command.split(" ");
            int index = Integer.parseInt(elementsCommand[0]);
            String direction = elementsCommand[1];
            int move = Integer.parseInt(elementsCommand[2]);
            int currentIndex = index;
            if (direction.equals("right")){
                index = index + move;
                if (index >= numbers || index < 0){
                    array[currentIndex] = 0;
                }
                else {
                    if (array[index] == 1){
                        array[index + 1] = 1;
                        array[currentIndex] = 0;
                    }
                    else {
                        array[index] = 0;
                        array[currentIndex] = 1;
                    }
                }
            }
            if (direction.equals("left")){
                index = index - move;
                if (index >= numbers || index < 0){
                    array[currentIndex] = 0;
                }
                else {
                    if (array[index] == 1){
                        array[index - 1] = 1;
                        array[currentIndex] = 0;
                    }
                    else {
                        array[index] = 0;
                        array[currentIndex] = 1;
                    }
                }
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < numbers; i++)
            System.out.print(array[i] + " ");
        System.out.println();

    }
}
