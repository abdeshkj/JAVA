package Recurssion;

public class Subset {
    static void main(String[] args) {
        String str = "asdfapplesfa";
        subset(str,"");
        System.out.println(subset2(str));
        System.out.println(subsetapple(str));
    }
    static void subset(String up,String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch =up.charAt(0);
        if(ch == 'a'){
            subset(up.substring(1),p);
        }else{
            subset(up.substring(1),p+ch);
        }
    }
    static String subset2(String up){
        if(up.isEmpty()){
            return up;
        }
        char ch =up.charAt(0);
        if(ch == 'a'){
            return subset2(up.substring(1));
        }else{
            return ch+subset2(up.substring(1));
        }
    }
    static String subsetapple(String up){
        if(up.isEmpty()){
            return up;
        }
        char ch =up.charAt(0);
        if(up.startsWith("apple")){
            return subsetapple(up.substring(5));
        }else{
            return ch+subsetapple(up.substring(1));
        }
    }

}
