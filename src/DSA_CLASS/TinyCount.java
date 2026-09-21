package DSA_CLASS;

import java.util.Scanner;

public class TinyCount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i =0;i<n;i++){
            System.out.println(count(arr,arr[i],i));
        }
    }
    static int count(int[] arr,int n,int i){
        int count =0;
        for(int j=i;j< arr.length;j++){
            if(arr[j]<n){
                count++;
            }
        }
        return count;
    }
}
