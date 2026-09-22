package DSA_CLASS;

import java.util.Scanner;

public class Abbreviation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(abb(s1,s2));
    }
    static boolean abb(String input,String output){
        int size =  output.length();
        if(!(size>=3&&size<=5)){
            return false;
        }
        int i = 0;
        int j =0;
        while(j<input.length()){
            if(i>=size){
                break;
            }
            if(output.charAt(i)==input.charAt(j)){
                i++;
                j++;
            }else{
            j++;}
        }
        if(i==size){
            return true;
        }
        return false;
    }
}
