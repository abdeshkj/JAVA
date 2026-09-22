package DSA_CLASS;

import java.util.Scanner;

public class PalindromeReverse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int mid = input.length()/2;
        String a = rev(input.substring(0,mid))+rev(input.substring(mid));
        System.out.println(pal(a));
    }
    static boolean pal(String input){
        int start =0;
        int end = input.length()-1;
        while(start<end){
            if(input.charAt(start)==input.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
    static String rev(String input){
        String ans ="";
        for(int i=input.length()-1;i>=0;i--){
            ans+=input.charAt(i);
        }
        return ans;
    }
}
