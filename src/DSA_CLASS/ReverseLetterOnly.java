package DSA_CLASS;

import java.util.Scanner;

public class ReverseLetterOnly {
    static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        String input = sci.nextLine();
        int start =0;
        int end = input.length()-1;
        StringBuilder sc =new StringBuilder(input);
        while (start < end) {
            char chStart = sc.charAt(start);
            char chEnd = sc.charAt(end);

            boolean isStartLetter = (chStart >= 'A' && chStart <= 'Z') || (chStart >= 'a' && chStart <= 'z');
            boolean isEndLetter = (chEnd >= 'A' && chEnd <= 'Z') || (chEnd >= 'a' && chEnd <= 'z');

            if (!isStartLetter) {
                start++;
            } else if (!isEndLetter) {
                end--;
            } else {
                char temp = chStart;
                sc.setCharAt(start, chEnd);
                sc.setCharAt(end, temp);
                start++;
                end--;
            }
        }
        String result = sc.toString();
        System.out.println(result);
    }
}
