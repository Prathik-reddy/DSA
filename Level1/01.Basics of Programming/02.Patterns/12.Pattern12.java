import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int fn=1;
        int sn=1;

        System.out.println("0");
        System.out.println("1\t1");
        for(int i =1;i<=n-2;i++){
            for(int j=1;j<=i+2;j++){
                int tn = fn+sn;
                System.out.print(tn+"\t");
                fn=sn;
                sn=tn;
            }
            System.out.println();
        }

    }
}