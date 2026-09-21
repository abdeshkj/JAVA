import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int p = sc.nextInt();
            int ans =0;
            while(x*y<p){
                if((x+1)*y>=x*(y+1)){
                    x++;
                }else{
                    y++;
                }
            ans++;}
        System.out.println(ans);



        T--;
    }

}
}