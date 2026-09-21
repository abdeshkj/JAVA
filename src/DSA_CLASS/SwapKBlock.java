package DSA_CLASS;

import java.util.Arrays;
import java.util.Scanner;

public class SwapKBlock {
    static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++ ){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++ ){
            int temp = arr[i];
            arr[i] = arr[i+k];
            arr[i+k] = temp;
            if(i%k==k-1){
                i+=k;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
