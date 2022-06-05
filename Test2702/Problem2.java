package Test2702;

import java.util.*;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> list = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] token = command.split(" ");
            if (token[0].equals("reverse") && token[1].equals("from") && token[3].equals("count")) {
                int startIndex = Integer.parseInt(token[2]);
                int count = Integer.parseInt(token[4]);
                List<String> smallList = new ArrayList<>();
                for (int i = startIndex; i < count + startIndex; i++) {
                    smallList.add(list.get(i));
                }
                Collections.reverse(smallList);

                for (int i = 0; i < count; i++) {
                    list.set(i + startIndex, smallList.get(i));
                }
            }
            else if (token[0].equals("sort") && token[1].equals("from") && token[3].equals("count")){
                int startIndex = Integer.parseInt(token[2]);
                int count = Integer.parseInt(token[4]);
                List<String> smallList = new ArrayList<>();
                for (int i = startIndex; i < count + startIndex; i++) {
                    smallList.add(list.get(i));
                }
                Collections.sort(smallList);
                for (int i = 0; i < count; i++) {
                    list.set(i + startIndex, smallList.get(i));
                }
            }

            else if (token[0].equals("remove")){
                int count = Integer.parseInt(token[1]);
                for (int i = 0; i < count; i++) {
                    list.remove(0);
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println(list.get(list.size()-1));
    }
}
