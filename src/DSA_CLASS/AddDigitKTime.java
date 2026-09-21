package DSA_CLASS;

import java.util.Scanner;

public class AddDigitKTime {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int su = k*sum(n);
//        while(su>9){
//            su =sum(su);
//        }
        // way to find sum of digit in single digit 1+(x-1)mod9
        // if num is div by 9 than single digit sum is 9
        //otherwise remainder when div by 9
        System.out.println(1+(su-1)%9);
    }
    static int sum(int a) {
        int ans = 0;
        while (a > 0) {
            ans += a % 10;
            a /= 10;

        }
        return ans;
    }
}
