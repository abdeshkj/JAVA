package Recurssion;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Abhishek Yadav");
        System.out.println("Enter no of digits");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[] ans = MSort(arr);
        MSortByIndex(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] MSort(int[] arr){
        if(arr.length ==1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = MSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = MSort(Arrays.copyOfRange(arr,mid,arr.length));
        return Merge(left,right);
    }
    static int[] Merge(int[] left,int[] right){
        int i=0;
        int j=0;
        int k = 0;
        int[] ans = new int[left.length+right.length];
        while (i<left.length&&j<right.length){
            if(left[i]<right[j]){
                ans[k] = left[i];
                i++;
            }else{
                ans[k]= right[j];
                j++;
            }
            k++;
        }
        while(i< left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
    static void MSortByIndex(int[] arr, int start, int end){
        if(end -start ==1) {
            return ;
        }
        int mid = start +(end-start)/2;
        MSortByIndex(arr, start,mid);
        MSortByIndex(arr,mid,end);
        Merge2(arr,start,mid,end);
    }
    static void Merge2(int[] arr,int start, int mid, int end){
        int i=start;
        int j=mid;
        int k = 0;
        int[] ans = new int[end-start];
        while (i<mid&&j<end){
            if(arr[i]<arr[j]){
                ans[k] = arr[i];
                i++;
            }else{
                ans[k]= arr[j];
                j++;
            }
            k++;
        }
        while(i< mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }
        while(j<end){
            ans[k] = arr[j];
            j++;
            k++;
        }
        for (int m=0;m<ans.length;m++){
            arr[start+m] = ans[m];
        }
    }
}
