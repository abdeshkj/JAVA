package Abdesh;

public class RemovePatience {
    public static void main(String[] args) {
        String str = "phkppo";
        Ans("",str,"pp");
    }
    static void Ans(String p,String up ,String rem){
        if(up.isBlank()){
            System.out.println(p);
            return;
        }
        if(up.startsWith(rem)){
            Ans(p+p.charAt(p.length()-1)+p.charAt(p.length()-1),up.substring(2),rem);
        }else{
            Ans(p+up.charAt(0),up.substring(1),rem);
        }
    }
}
