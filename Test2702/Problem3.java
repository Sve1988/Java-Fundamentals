package Test2702;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> list = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        int leftSum = 0;
        int rightSum = 0;

        if (type.equals("cheap")){
            for (int i = 0; i < entryPoint; i++) {
                if (list.get(i) < list.get(entryPoint)){
                    leftSum = leftSum + list.get(i);
                }
            }
            for (int i = entryPoint + 1; i < list.size(); i++) {
                if (list.get(i) < list.get(entryPoint)){
                    rightSum = rightSum + list.get(i);
                }
            }
        }

        else if (type.equals("expensive")){
            for (int i = 0; i < entryPoint; i++) {
                if (list.get(i) >= list.get(entryPoint)){
                    leftSum = leftSum + list.get(i);
                }
            }
            for (int i = entryPoint + 1; i < list.size(); i++) {
                if (list.get(i) >= list.get(entryPoint)){
                    rightSum = rightSum + list.get(i);
                }
            }
        }

        if (leftSum >= rightSum){
            System.out.printf("Left - %d", leftSum);
        }
        else {
            System.out.printf("Right - %d", rightSum);
        }
    }
}
