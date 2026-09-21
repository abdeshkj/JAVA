package DSA_CLASS;

import java.util.Arrays;
import java.util.Scanner;

public class MovinfAllZeros {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start =0;
        int second = start+1;
        while(second<n){
            if(arr[second]==0){
                second++;
            } else if (arr[start] != 0) {
                start++;
            }else{
                int temp = arr[start];
                arr[start] = arr[second];
                arr[second] = temp;
                start++;
                second++;
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}
