public class ArrangeCoint33 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(7));

    }
    static int arrangeCoins(int n) {
        if (n <= 1) return n;
        int start = 3;
        int ans = 2;
        for(int i = 3;i<n;i++){
            if(n<=start){
                return c(n,ans);
            }
            start +=i;
            ans++;
        }

        return c(n,ans);

    }
    static int c(int target, int n){
        int count=0;
        while(target>0){
            target -=n;
            count++;
            n--;
        }
        return count;
    }
}
