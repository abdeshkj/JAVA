package Recurssion;

public class Reverse {
    static void main() {
        int ans = rev(4213,0 );
        System.out.println(ans);
    }
    static int rev(int n,int reversed){
        if(n==0){
            return reversed;
        }
        reversed = 10*reversed+(n%10);
        return rev(n/10,reversed);
    }
}
