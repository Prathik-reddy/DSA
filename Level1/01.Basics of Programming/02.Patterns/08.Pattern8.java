import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n  = scn.nextInt();
        for(int i = n; i>0;i--){
            int spc = i;
            for(int j=1;j<spc;j++){
                System.out.print("\t");
            }
            System.out.println("*");
        }

    }
}