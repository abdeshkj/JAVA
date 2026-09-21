package LeetCode;

import java.util.ArrayList;

public class PhoneLetter {
    static void main(String[] args) {
        String[] arr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        System.out.println(output(arr,"","235"));
    }
    static ArrayList<String> output(String[] arr, String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        for(int i=0;i<arr[digit-2].length();i++){
            list.addAll(output(arr,p+arr[digit-2].charAt(i),up.substring(1)));
        }
        return list;
    }
}
