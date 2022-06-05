package Week2.Friday;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int count = 0;
        double check1 = n / 2.0;

        while (n >= m){
            count++;
            n = n - m;
            if (check1 == n){
                if (y > 0){
                    n = n / y;
                }
            }
        }
        System.out.println(n);
        System.out.println(count);
    }
}
