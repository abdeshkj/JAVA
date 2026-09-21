package Recurssion;
import java.util.Arrays;

public class bubbleSort {
    static void main(String[] args) {
        int[] arr = {2,3,4,4,5,9,10,15,6};
        Sort2(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr, int s,int e){
        if(e==0){
            return;
        }
        int t=0;
        boolean flag = false;
        while(t<e-1){
            if(arr[s]>arr[s+1]){
                swap(arr,s,s+1);
                flag = true;
            }
            s++;
            t++;
        }
        if(!flag)return;
        Sort(arr,0,e-1);
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void Sort2(int[] arr,int s, int e){
        if(e==0){
            return;
        }
        if(s<e){
            if(arr[s]>arr[s+1]){
                swap(arr,s,s+1);
            }
            Sort2(arr,s+1,e);
        }else{
        Sort2(arr,0,e-1);
    }}
}
