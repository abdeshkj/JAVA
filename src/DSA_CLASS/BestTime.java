package DSA_CLASS;

import java.util.Scanner;

public class BestTime {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max =0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(max<(arr[j]-arr[i])){
                    max = arr[j]-arr[i];
                }
            }
        }
        System.out.println(max);
    }
}
