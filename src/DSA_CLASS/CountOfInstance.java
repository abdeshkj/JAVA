package DSA_CLASS;

import java.util.Scanner;

public class CountOfInstance {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String S1 = sc.nextLine();
        S1 =S1.toLowerCase();
        String S2 = sc.nextLine();
        S2 = S2.toLowerCase();
        for(int i =0;i<n;i++){
            System.out.println(count1(S2,S1.charAt(i),0,m-1,0));
        }
    }
    static int count1(String str,char ch, int start , int end,int count){
        if(start<end){
            return 0;
        }
        int mid = start+(end-start)/2;
        if(str.charAt(mid)==ch) {count++;}
        int a =count1(str,ch,start,mid-1,count);
        int b = count1(str,ch,mid+1,end,count);
        return a+b;

    }
}
