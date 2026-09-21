package DSA_CLASS;

import java.util.Arrays;
import java.util.Scanner;

public class SumMerge {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i =0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for (int i =0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int[] ans = new int[2*n];
        int f = 0;
        int s = 0;
        int i =0;
        while(f!=5&&s!=5){

            if(arr1[f]>arr2[s]){
                ans[i] = arr2[s];
                s++;
                i++;
            }else{
                ans[i] = arr1[f];
                f++;
                i++;
            }
        }
        while(s !=5){
            ans[i] = arr2[s];
            i++;
            s++;
        }
        while(f !=5){
            ans[i] = arr1[f];
            i++;
            f++;
        }
        System.out.println(Arrays.toString(ans));
        System.out.println((ans[n]+ans[n-1]));
    }
}
