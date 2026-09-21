import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,1,2};
        int n = arr.length;
        int i = 0;
        while( i<n){

            if(arr[i] != arr[arr[i]-1]){
                swap(arr, i, arr[i]-1);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct]  = temp;
    }

}
