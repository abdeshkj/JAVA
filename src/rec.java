import java.util.Scanner;

public class rec {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int i = sc.nextInt();
            i = i/2;
            int max =0;
            for (int j=1;j<=i;j++){
                int cal = (j)*(i-(j));
                if(cal>max){
                    max = cal;
                }
            }
            System.out.println(max);
            T--;
        }
    }
}
