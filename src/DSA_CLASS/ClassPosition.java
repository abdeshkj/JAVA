package DSA_CLASS;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassPosition {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i =0;i<n;i++){
            System.out.println(rank(arr,i));
        }
    }
    static int rank(int[] arr,int n){
        int count =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>arr[n]){
                count++;
            }
        }
        return count+1;
    }
}
