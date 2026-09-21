package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> subsequence = new ArrayList<>();
        subsequence.add(0,arr[0]);
        for (int i =1;i<n;i++){
            if(arr[i]==subsequence.get(subsequence.size()-1)+1||arr[i]==subsequence.get(subsequence.size()-1)-1||arr[i]==subsequence.get(subsequence.size()-1)*3||arr[i]==subsequence.get(subsequence.size()-1)*2)
                subsequence.add(arr[i]);
        }
        int count =0;
        for(int i=0;i<subsequence.size();i++){
            count += Divisora(subsequence.get(i));
        }
        System.out.println(count);
    }
    static int Divisora(int a){
        int n =0;
        int b =0;
        for(int i =1; i*i<=a;i++){
            if(a%i==0){
                n++;
            }
            b=i;
        }
        if(b*b==a) {
            return 2 * n-1;
        }
        return 2*n;
    }
}



