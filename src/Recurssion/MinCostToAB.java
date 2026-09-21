package Recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class MinCostToAB {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            ArrayList<Integer> ans = cost(a,b,0,0,p,q,r,0);
            int min =Integer.MAX_VALUE;
            for (int i =0;i< ans.size();i++){
                if(min> ans.get(i)){
                    min = ans.get(i);
                }
            }
            System.out.println(min);
            t--;

        }

    }
    static ArrayList<Integer> cost(int a, int b, int x, int y, int p, int q , int r, int money){
        if(a ==x&b==y){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(money);
            return list;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(x+1<=a){
            ans.addAll(cost(a,b,x+1,y,p,q,r,money+p));
        }
        if(x+2<=a){
            ans.addAll(cost(a,b,x+2,y,p,q,r,money+p));
        }
        if(y+2<=b){
            ans.addAll(cost(a,b,x,y+2,p,q,r,money+q));
        }
        if(y+1<=b){
            ans.addAll(cost(a,b,x,y+1,p,q,r,money+q));
        }
        if(x+1<=a&y+1<=b){
            ans.addAll(cost(a,b,x+1,y+1,p,q,r,money+r));
        }
        return ans;
    }
}
