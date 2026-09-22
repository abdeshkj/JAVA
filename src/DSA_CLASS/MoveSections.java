package DSA_CLASS;

import java.util.Scanner;

public class MoveSections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = "";
        String last = "";
        for (int i = 0; i < input.length(); i++) {
            if ((i + 1) % 4 == 0 || (i + 1) % 6 == 0) {
                last += input.charAt(i);
            } else {
                ans += input.charAt(i);
            }
        }
        System.out.println(ans + last);
        sc.close();
    }
}