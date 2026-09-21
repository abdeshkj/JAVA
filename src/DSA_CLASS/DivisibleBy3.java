package DSA_CLASS;

import java.util.Scanner;

public class DivisibleBy3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int ans =0;
        for(int i = start;i<=end;i++){
            if(i%3==0&sum(i)){
                ans++;
            }
        }
        System.out.println(ans);
    }
    static boolean sum(int a){
        int ans = 0;
        while(a>0){
            ans+=a%10;
            a/=10;

        }
        if(ans%2==0){
            return true;
        }
        return false;
    }
}
