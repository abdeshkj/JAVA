import java.util.*;

public class MatrixSearch {
    // sorted row and col wise
    public static void main(String[] args) {
        int[][] arr=  {
                {10,15,20,40},
                {12,17,25,50},
                {18,26,35,65},
                {21,29,41,80}
        };
        int target = 29;
        int[] ans= MSearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] MSearch(int[][] arr,int target){
        int row =0;
        int col = arr.length-1;
        while(row <arr.length&&col>=0){
            if(target == arr[row][col]){
                return new int[] {row,col};
            }
            if(target < arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
         return new int[] {-1,-1};
    }
}
