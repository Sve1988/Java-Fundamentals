package Week5.Friday;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replaceAll("\\s+"," ");
        List<String> items = Arrays.stream(input.split("\\|+")).map(String::trim).collect(Collectors.toList());
        Collections.reverse(items);
        List<String> appendArray = new ArrayList<>();
        for (String element : items) {
            if(!element.equals("")){
                appendArray.add(element);
            }
        }
        System.out.println(String.join(" ", appendArray));
    }
}
