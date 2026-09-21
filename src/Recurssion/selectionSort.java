package Recurssion;

import java.util.Arrays;

public class selectionSort {
    static void main(String[] args) {
        int[] arr = {2,3,4,4,5,9,10,15,6};
        sort2(arr, 0,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int e){
        if(e==0){
            return;
        }
        int max =max(arr,e);
        swap(arr,max,e);
        sort(arr,e-1);

    }
    static int max(int[] arr,int e){
        int max = 0;
        for(int i =0;i<=e;i++){
            if(arr[i]>arr[max]){
                max =i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void sort2(int[] arr,int s,int e,int max){
        if(e==0){
            return;
        }
        if(s<e){
            if(arr[s]>arr[max]){
                sort2(arr,s+1,e,s);
            }else{
                sort2(arr,s+1,e,max);
            }
        }else{
            swap(arr,max,e-1);
            sort2(arr,0,e-1,0);
        }
    }
}
