import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chirag Choudhary");
        System.out.println("Enter no of digits");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(SelectionSort(arr)));
    }
    static int[] BubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if (arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
    static int[] SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int m = min(arr, i, n - 1);
            int temp = arr[m];
            arr[m] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    static int min(int[] arr, int start,int end){
        int min = start;
        for(int i = start;i<=end;i++){
            if(arr[min]>arr[i]){
                min = i;
            }
        }
        return min;
    }
    static int[] InsertionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }
}
