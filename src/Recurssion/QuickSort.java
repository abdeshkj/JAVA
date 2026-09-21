package Recurssion;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Abhishek Yadav");
        System.out.println("Enter no of digits");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr,int start,int end){
        if(end <start){
            return;
        }
        int i=start;
        int j = end;
        int m = start+(end-start)/2;
        int pivit = arr[m];

        while(i<=j) {
            while (arr[i] < pivit) {
                i++;
            }
            while (arr[j] > pivit) {
                j--;
            }
            if(i<=j){
            int temp=arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }}
        Sort(arr,start,j);
        Sort(arr,i,end);
    }
}
