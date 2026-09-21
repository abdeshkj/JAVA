package DSA_CLASS;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreater {
    static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++ ){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++ ){
            greater(arr,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    static void greater(int[] arr,int s){
        for(int i =s+1;i<arr.length;i++){
            if(arr[s]<arr[i]){
                arr[s] = arr[i];
                return;
            }
        }
        arr[s] = 0;
    }
}
