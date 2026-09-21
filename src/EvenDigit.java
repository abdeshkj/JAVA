import jdk.dynalink.beans.StaticClass;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {1245};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++){
            ans += count(nums[i]);
        }
        return ans;
    }
    static int count(int n){
        int count = 0;
        while(n>0){
            n /=10;
            count++;
        }
        if(count%2==0){
            return 1;
        }
        return 0;
    }
}
