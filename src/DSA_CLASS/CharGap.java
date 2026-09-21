package DSA_CLASS;

import java.util.Scanner;

public class CharGap {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        for (int i=0;i<S.length();i++){
            boolean flag = true;
            for (int j=i+1;j<S.length();j++){
                if(S.charAt(i)==S.charAt(j)){
                    System.out.print(j-i-1);
                    flag = false;
                    break;
                }
            }
            if(flag){
            System.out.print(-1);}
        }
    }
}
