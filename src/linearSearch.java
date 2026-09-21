import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        System.out.println("Chirag 2400321530067");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element");
        int target = sc.nextInt();
        int result = LinearUsingReccursion(arr,target,0);
        System.out.println("index of target is "+result+" using linaer search");
        int result1 = binarySearch(arr,target,0,arr.length-1);
        System.out.println("index of target is "+result1+" using binary search");

    }
    static int LinearUsingReccursion(int[] arr, int target, int index){
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return LinearUsingReccursion(arr, target, index + 1);
    }
    static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, right);
    }

}
