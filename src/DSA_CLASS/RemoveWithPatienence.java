package DSA_CLASS;

import java.util.Scanner;

public class RemoveWithPatienence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String m = sc.nextLine();
        String ans ="";
        for(int i = 0;i<s.length()-1-m.length();i++){
            if(s.substring(i,m.length()-1-i)==m){
                for (int j=0;j<m.length()-1;j++){
                ans += s.substring(i-1);
            }}else{
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
