package Abdesh;

import java.util.Arrays;
import java.util.Scanner;

public class SwapTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for (int i =0;i<n/2;i++){
            swap(arr,k,i,n-1-i,m-1-i);
        }
        System.out.println(Arrays.deepToString(arr));
    }
    static void swap(int[][] arr,int k,int r,int m, int c){
        for(int i =0;i<k;i++){
            int temp = arr[r][c-i];
            arr[r][c-i] = arr[m][k-1-i];
            arr[m][k-1-i] = temp;
        }


    }
}
