package DSA_CLASS;

public class JumpingNumber {
    static void main(String[] args) {
        for (int i=  0;i<105;i++){
            jump(i);
        }
    }
    static void jump(int n){
        if(n<10){
            System.out.print(n+" ");
        }else{
            int m=n;
        while(n>=10){
            int temp = n%10;
            n/=10;
            if(temp+1!=n%10 && temp-1!=n%10){
                return;
            }
        }
        System.out.print(m+" ");}
    }
}
