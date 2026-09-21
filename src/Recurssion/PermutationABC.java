package Recurssion;

import java.util.ArrayList;

public class PermutationABC {
    static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = per("",str);
        System.out.println(ans);
    }
    static ArrayList<String> per(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            ans.addAll(per(p.substring(0,i)+ch+p.substring(i),up.substring(1)));
        }
        return ans;
    }
}
