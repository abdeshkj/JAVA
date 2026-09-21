package DSA_CLASS;

import java.util.Scanner;

public class PasswordMatching {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = sc.nextLine();
        sc.nextLine();
        int t = sc.nextInt();
        while(t>0){
            int b = sc.nextInt()%s.length();
            String a ="";
            if(b>0){
                a = s.substring(s.length()-b-1,s.length()-1) + s.substring(0,s.length()-b);
            }else{
                a = s.substring(b-1,s.length()-1) + s.substring(0,s.length()-b);
            }
            if(a==r){
                System.out.println("match");
            }else{
                System.out.println("invalid");
            }
            t--;

        }
    }
}
