package DSA_CLASS;

import java.util.Scanner;

public class AllArmstrong {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i<=b;i++){
            int d = digit(i);
            if(sum(i,d)==i){
                System.out.println(i);
            }
        }

    }
    static int digit(int n){
        int count =0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    static int sum(int n,int p){
        int sum =0;
        while(n>0) {
            int temp = n % 10;
            sum += Math.powExact(temp,p);
            n /= 10;
        }
        return sum;
    }
}
