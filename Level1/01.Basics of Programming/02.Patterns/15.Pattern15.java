import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int spc=n/2;
        int star=1;
        int val=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("\t");
            }
            int cval=val;
            for(int j=1;j<=star;j++){
                System.out.print(cval+"\t");
                if(j<=star/2){
                    cval++;
                }else{
                    cval--;
                }
            }
            if(i<=n/2){
                star+=2;
                spc--;
                val++;
            }else{
                star-=2;
                spc++;
                val--;
            }
            System.out.println();

        }

    }
}